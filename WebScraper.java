import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        String url = "https://books.toscrape.com/"; // Example e-commerce test site
        String csvFile = "products.csv";

        try {
            // Connect to website
            Document doc = Jsoup.connect(url).get();

            // Select product details
            Elements products = doc.select(".product_pod");

            // Create CSV file
            FileWriter writer = new FileWriter(csvFile);
            writer.append("Product Name,Price,Rating\n");

            // Extract data
            for (Element product : products) {
                String name = product.select("h3 a").attr("title");
                String price = product.select(".price_color").text();
                String rating = product.select(".star-rating").attr("class").replace("star-rating", "").trim();

                // Write to CSV
                writer.append(name).append(",")
                        .append(price).append(",")
                        .append(rating).append("\n");
            }

            writer.flush();
            writer.close();

            System.out.println("✅ Data scraped and saved to " + csvFile);

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
