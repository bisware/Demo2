import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {

            System.setProperty("http.proxyHost", "proxy-centro.risorse.enel");
            System.setProperty("http.proxyPort", "8080");

            Document doc = Jsoup.connect("http://www.spietati.it/z_recensioni.asp").timeout(0).get();

            Elements divs = doc.select(".tableRecensioni a");

            for (Element div : divs)
                System.out.println(div.text());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
