package com.qr.aadar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

/**
 * <?xml version="1.0" encoding="UTF-8"?>
 * <PrintLetterBarcodeData uid="262249972923" name="Ramasamy.K" gender="M" yob=
 * "1991" co="S/O Kasiviswanathan.Rm" house="29/2,Mannappan Street," street="Sai
 * Complex" loc="Kottur" vtc="Kotturpuram S.O" dist="Chennai" state="Tamil Nadu"
 * pc="600085"/>
 * 
 * @author ramasamykasiviswanathan
 *
 */
public class AadharQRCode {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		PrintLetterBarcodeData printLetterBarcodeData = populatePrintLetterBarcodeData();
		try(FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir")+System.getProperty("file.separator")+printLetterBarcodeData.getUid()+
				printLetterBarcodeData.getName().replaceAll("\\.", " ").trim()+".PNG"))
		{
			fileOutputStream.write(QRCode.from(printLetterBarcodeData.toString()).withCharset("UTF-8").withErrorCorrection(ErrorCorrectionLevel.H).to(ImageType.PNG).stream().toByteArray());
		}
	}
	
	private static PrintLetterBarcodeData populatePrintLetterBarcodeData()
	{
		PrintLetterBarcodeData data = new PrintLetterBarcodeData();
		data.setCo("S/O Kasiviswanathan.Rm");
		data.setDist("Chennai");
		data.setGender("M");
		data.setHouse("29/2,Mannappan Street,");
		data.setLoc("Kottur");
		data.setName("Ramasamy.K");
		data.setPc("600085");
		data.setState("Tamil Nadu");
		data.setStreet("Sai Complex");
		data.setUid("262249972923");
		data.setVtc("Kotturpuram");
		data.setYob("1991");
		return data;
	}
	/*private static PrintLetterBarcodeData populatePrintLetterBarcodeData()
	{
		PrintLetterBarcodeData data = new PrintLetterBarcodeData();
		System.out.println("Kindly end the following data:");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.printf("Aadhar ID:");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}*/
}
