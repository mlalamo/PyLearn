
package certificate;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import java.io.FileOutputStream;







public class Certificate {

    public static void main(String[] args) {
        
    Document document = new Document();
    String input = "C:\\Users\\Lovely\\Documents\\NetBeansProjects\\certificate\\src\\Image\\cert.jpg"; 
    String output = "C:\\Users\\"+ System.getProperty("user.name") +"\\Desktop\\cert.pdf";
 //   Rectangle rect = new Rectangle(PageSize.LETTER.rotate());
    document.setPageSize(PageSize.A4.rotate());
    
    try {
      FileOutputStream fos = new FileOutputStream(output);
      PdfWriter writer = PdfWriter.getInstance(document, fos);

      writer.open();
      document.open();
      
      
      
      Image image = Image.getInstance(input);
      image.setBorder(Image.NO_BORDER);
      image.setAlignment(Element.ALIGN_CENTER);
      image.scaleAbsolute(800,700);
      document.add(image);
      
      
      
      document.close();
      writer.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  
  
        
    }
    
}
