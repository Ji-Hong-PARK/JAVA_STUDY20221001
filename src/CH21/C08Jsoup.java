package CH21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C08Jsoup {

	public static void main(String[] args) throws Exception {

		// URL과 연결된 Jsoup.connection
		Connection conn = Jsoup.connect("https://naver.com");

		// DOM객체를 꺼내와 저장
		Document document = conn.get();
		//System.out.println(document);

		// DOM객체 안에서 img태그요소만 추출
		Elements elements = document.getElementsByTag("img");
		// System.out.println(elements);

		String imgUrl = null;
		for (int i = 0; i < elements.size(); i++) {

			try {
				if (elements.get(i).toString().contains("http")) {
					//elements안의 i번째 요소에서 src속성에 해당되는 값을 추출
					imgUrl = elements.get(i).getElementsByAttribute("src").attr("src");
				} else if (elements.get(i).toString().contains("//")) {
					imgUrl = "https:" + elements.get(i).getElementsByAttribute("src").attr("src");
				}

				System.out.println(imgUrl);

				// URL연결
				URL url = new URL(imgUrl);
				InputStream in = url.openStream();
				
				
				BufferedInputStream bin = new BufferedInputStream(in);
				byte [] buff = new byte[4096];
				String filename = "ImageFile";
				OutputStream out = new FileOutputStream("c:\\iotest\\" + filename + i + ".png");
				int data = 0;
				while (true) {
					data = bin.read(buff);
					if (data == -1) {
						break;
					}
					out.write(buff,0,data);
					out.flush();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}