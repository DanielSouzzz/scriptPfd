package org.example;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import java.io.IOException;

public class AddScriptPDF {
    public void writerScript (String inputPdf, String outputPdf, String jsCode) throws IOException {
        PdfDocument pdfDocument = new PdfDocument(new PdfReader(inputPdf), new PdfWriter(outputPdf));

        //String jsCode = String.format("app.launchURL('%s', true);

        pdfDocument.getCatalog().setOpenAction(PdfAction.createJavaScript(jsCode));
        pdfDocument.close();
        System.out.println("JavaScript created!");
    }
}
