package training.apacheCommons.pdf_iText;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class pdf_iText
{
    private static String pdfPath = "document.pdf";

    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        Document document = new Document();
        FileOutputStream stream = new FileOutputStream(pdfPath);
        PdfWriter.getInstance(document,stream);

        document.open();

        Paragraph p1 = new Paragraph("Pierwszy tekst do iTexta");
        document.add(p1);

        document.close();
    }
}
