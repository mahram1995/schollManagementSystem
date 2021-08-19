/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author HP
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class creaPdf {

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("hwloo.pdf"));
            document.open();
            document.add(new Paragraph("satripara primari school"));
            // set colum width
            float colum[] = {50f, 300f, 50f};

            // creat table
            PdfPTable table = new PdfPTable(colum);

            // create column name
            PdfPCell c1 = new PdfPCell(new Paragraph("serial"));
            PdfPCell c2 = new PdfPCell(new Paragraph("Item"));
            PdfPCell c3 = new PdfPCell(new Paragraph("amount"));

            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            c1 = new PdfPCell(new Paragraph("01"));
            c2 = new PdfPCell(new Paragraph("Admission fee"));
            c3 = new PdfPCell(new Paragraph("5000"));
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            document.add(table);

            document.close();

        } catch (DocumentException | FileNotFoundException e) {
        }
    }

}
