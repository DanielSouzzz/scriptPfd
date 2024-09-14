package org.example;

public class Main {
    public static void main(String[] args) {
        AddScriptPDF addSc = new AddScriptPDF();
        UserPrompt dataPrompt = new UserPrompt();

        String[] result = dataPrompt.dataPdf();

        String filePath = result[0];
        String fileName = result[1];
        try {
            String inputPdf = filePath;
            String outputPdf = fileName;
            String jsCode = "app.alert('You fell for Mario gamers prank!')";
            addSc.writerScript(inputPdf, outputPdf,jsCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
