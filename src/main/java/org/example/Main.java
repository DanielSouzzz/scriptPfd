package org.example;

public class Main {
    public static void main(String[] args) {
        AddScriptPDF addSc = new AddScriptPDF();
        try {
            String inputPdf = "/path/file";
            String outputPdf = "document_js.pdf";
            String url = "app.alert('You fell for Mario gamers prank!')";

            addSc.writerScript(inputPdf, outputPdf,url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}