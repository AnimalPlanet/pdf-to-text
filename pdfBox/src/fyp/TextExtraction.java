package fyp;

import java.io.PrintWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.apache.pdfbox.util.PDFTextStripper;

public class TextExtraction 
{
	public static void main(String [] args) throws Exception
	{
		  PDDocument doc = PDDocument.load("D:/cpdf.pdf");
	      PDDocumentOutline root = doc.getDocumentCatalog().getDocumentOutline();	
	      PDFTextStripper stripper = new PDFTextStripper();
	      PDOutlineItem item = root.getFirstChild();
	      PDOutlineItem nextItem;
	      String text="";
	      String name="";
	      String extn=".txt";
	      while( item != null )
	      {
	         // System.out.println( "Item:" + item.getTitle() );
	         
	    	  name=item.getTitle();
	    	  name=name+extn;
	    	  PrintWriter p=new PrintWriter(name);
	    	  
	          stripper.setStartBookmark(item);
	          
	          nextItem = item.getNextSibling();
	         
	        //  stripper.w
	          stripper.setEndBookmark(nextItem);
	          stripper.writeText(doc, p);
	         // stripper.w 
	          PDOutlineItem child = item.getFirstChild();
	          p.close();
	          while( child != null )
	          {
	              System.out.println( "    Child:" + child.getTitle() );
	              child = child.getNextSibling();
	          }
	          item = item.getNextSibling();
	      }
	}
}
