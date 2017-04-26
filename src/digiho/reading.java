/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digiho;

import java.io.IOException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
 
/**
 *
 * @author Hp
 */
public class reading {
     public static void main(String[] args) {
        try {
             
            PdfReader reader = new PdfReader("G:\\43211688.pdf");
            System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
            String page = PdfTextExtractor.getTextFromPage(reader, 2);
            System.out.println("Page Content:\n\n"+page+"\n\n");
            System.out.println("Is this document tampered: "+reader.isTampered());
            System.out.println("Is this document encrypted: "+reader.isEncrypted());
 
        } catch (IOException e) {
            e.printStackTrace();
        }

}}