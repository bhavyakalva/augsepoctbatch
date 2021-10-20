package aug26_overridding;//method overriding

public class ColorTV extends BlackAndWhiteTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV ctv = new ColorTV();
		ctv.volume();
		ctv.channelChange();
		ctv.pictureTube();
		System.out.println("Color TV creation is done");
	}

	ColorTV() {
		System.out.println("I am creating the ColorTV");
	}

	void pictureTube() {
		System.out.println("Color TV picture tube");

	}

}
