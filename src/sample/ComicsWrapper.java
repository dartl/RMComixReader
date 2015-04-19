package sample;

import java.util.HashMap;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Created 19.04.2015.
 * Обертка класса HashMap класса Comics, для вывода в xml формат.
 */
@XmlRootElement(name = "Comicses")
public class ComicsWrapper {
    private HashMap<Integer,Comics> ComicsMap = new HashMap<Integer,Comics>();

    @XmlElement(name = "Comics")
    public HashMap<Integer, Comics> getComicsMap() {
        return ComicsMap;
    }

    public void setComicsMap(HashMap<Integer, Comics> comicsMap) {
        ComicsMap = comicsMap;
    }


}
