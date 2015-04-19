package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;

public class Main extends Application {

    private File ComicsesFilePath; /* Хранит текущий путь до файла с данными о комиксах */
    private HashMap<Integer,Comics> Comicses = new HashMap<Integer,Comics>(); /* Хэш таблица с данными о комиксах */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        /* тестовый код для проверки сохранения данных в xml формате */
        ComicsesFilePath = new File("K:/","test.xml");
        Comics Temp = new Comics("a","b","c",2015,"d","e","f","g");
        for (int i = 0; i < 5; i++) {
            Comicses.put(i,Temp);
        }
        saveComicsesDataToFile(ComicsesFilePath);
    }


    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Метод для загрузки данных о комиксах из xml формата
     * @param file Путь до файла из которого происходит загрузка данных
     */
    public void loadComicsesDataFromFile(File file) {
        try {
            JAXBContext context = JAXBContext
                    .newInstance(ComicsWrapper.class);
            Unmarshaller um = context.createUnmarshaller();

            // Читаем XML формат и демаршализируем его
            ComicsWrapper wrapper = (ComicsWrapper) um.unmarshal(file);

            Comicses.clear();
            setComicses(wrapper.getComicsMap());

            // Сохраняем текущий путь до файла с данными
            setComicsesFilePath(file);

        } catch (Exception e) {
        }
    }

    /**
     * Метод сохранения данных о всех комиксах в формате XML
     * @param file Путь до файла куда сохраняем данные
     */
    public void saveComicsesDataToFile(File file) {
        try {
            JAXBContext context = JAXBContext
                    .newInstance(ComicsWrapper.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Wrapping our person data.
            ComicsWrapper wrapper = new ComicsWrapper();
            wrapper.setComicsMap(Comicses);

            // Marshalling and saving XML to the file.
            m.marshal(wrapper, file);

            // Save the file path to the registry.
            setComicsesFilePath(file);
        } catch (Exception e) { // catches ANY exception
        }
    }


    public File getComicsesFilePath() {
        return ComicsesFilePath;
    }

    public void setComicsesFilePath(File comicsesFilePath) {
        ComicsesFilePath = comicsesFilePath;
    }

    public HashMap<Integer, Comics> getComicses() {
        return Comicses;
    }

    public void setComicses(HashMap<Integer, Comics> comicsMap) {
        Comicses = comicsMap;
    }
}
