package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;

import java.io.File;
import java.io.FilenameFilter;

public class Controller {
    private int currentPage = 0;
    String[] jpgList;
    File currentDir;

    @FXML
    Button openDirBtn,
            prevPageBtn,
            nextPageBtn;
    @FXML
    ImageView pageViewer;

    public void prevPageBtn() {
        if (jpgList != null && currentPage > 0) {
            currentPage--;
        }
        showPage();
    }

    public void nextPageBtn() {
        if (jpgList != null && currentPage < jpgList.length - 1) {
            currentPage++;
        }
        showPage();
    }

    public void showPage() {
        Image img = new Image("file:" + currentDir.getPath() + "\\" + jpgList[currentPage]);
        pageViewer.setImage(img);

    }

    public void openDirectoryChooser() {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Select directory with comix pages...");

        currentDir = chooser.showDialog(null);
        PageTypeFilter filter = new PageTypeFilter();
        jpgList = currentDir.list(filter);

        currentPage = 0;
        showPage();
    }

    private void showCurrentDirectorPages() {
        System.out.println(currentDir.getPath() + " "  + currentPage);
        for (String n : jpgList) {
            System.out.println("  " + n);
        }
    }

    class PageTypeFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            return (name.endsWith(".jpg") || name.endsWith(".png"));
        }
    }
}
