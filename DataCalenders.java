import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataCalenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(sd.format(c.getTime()));
		System.out.println(Calendar.NOVEMBER);
		
	}

}
