package wkhtmltopdf.java_wkhtmltopdf_wrapper;

import org.junit.Test;

import com.github.jhonnymertz.wkhtmltopdf.wrapper.Pdf;

public class AppConvertTest {

	@Test
	public void test() {
		testConvertHTMLURLToPDF();
	}
	
	public void testConvertHTMLFileToPDF(){
        System.out.println( "Start process" );
        String url = "C:\\Users\\detectortroyano\\Downloads\\file-html.html";
        String outDirectory = "C:\\Users\\detectortroyano\\Downloads\\";
        String outFile = outDirectory+"file-html.pdf";
        try {
            Pdf pdf = new Pdf();
            pdf.addPageFromUrl(url);
            pdf.saveAs(outFile);
            System.out.println( "Completed process" );
		} catch (Exception e) {
			System.out.println( "Error =>" );
		}
	}
	
	public void testConvertHTMLURLToPDF(){
        System.out.println( "Start process" );
        String url = "https://www.google.com/";
        String outDirectory = "C:\\Users\\detectortroyano\\Downloads\\";
        String outFile = outDirectory+"file-html.pdf";
        try {
            Pdf pdf = new Pdf();
            pdf.addPageFromUrl(url);
            pdf.saveAs(outFile);
            System.out.println( "Completed process" );
		} catch (Exception e) {
			System.out.println( "Error =>" );
		}
	}	

}
