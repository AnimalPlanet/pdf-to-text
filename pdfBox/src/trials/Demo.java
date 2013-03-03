package trials;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;

public class Demo 
{
	public static void main(String [] args) throws Exception
	{
		 PDDocument doc = PDDocument.load("D:/ppts n notes/Final_Year_Project/Clustering - Introduction.pdf");
	      PDDocumentOutline root = doc.getDocumentCatalog().getDocumentOutline();	
	      
	      PDOutlineItem item = root.getFirstChild();
	      while( item != null )
	      {
	          System.out.println( "Item:" + item.getTitle() );
	          PDOutlineItem child = item.getFirstChild();
	          while( child != null )
	          {
	              System.out.println( "    Child:" + child.getTitle() );
	              child = child.getNextSibling();
	          }
	          item = item.getNextSibling();
	      }
	}
}
