package wkhtmltopdf.java_wkhtmltopdf_wrapper;

import org.junit.Test;

import com.github.jhonnymertz.wkhtmltopdf.wrapper.Pdf;
import com.github.jhonnymertz.wkhtmltopdf.wrapper.params.Param;

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
            pdf.addParam(new Param("-O", "landscape"));	//--orientation
            pdf.addParam(new Param("-B", "20"));		//--margin-bottom
            pdf.addParam(new Param("-L", "20"));		//--margin-left
            pdf.addParam(new Param("-R", "20"));		//--margin-right
            pdf.addParam(new Param("-T", "20"));		//--margin-top
            pdf.saveAs(outFile);
            System.out.println( "Completed process" );
		} catch (Exception e) {
			System.out.println( "Error =>" + e);
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
            pdf.addParam(new Param("-O", "landscape"));	//--orientation
            pdf.addParam(new Param("-B", "20"));		//--margin-bottom
            pdf.addParam(new Param("-L", "20"));		//--margin-left
            pdf.addParam(new Param("-R", "20"));		//--margin-right
            pdf.addParam(new Param("-T", "20"));		//--margin-top
            pdf.saveAs(outFile);
            System.out.println( "Completed process" );
		} catch (Exception e) {
			System.out.println( "Error =>" + e);
		}
	}

}
