package hu.me.krz.haladojava;

public class Point {

	private final long x;
	private final long y;
	private final long z;

	public Point(long x, long y, long z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}

	public Point translate(Point TranslatorPoint) {
		Point point = new Point(this.x + TranslatorPoint.x, this.y + TranslatorPoint.y, this.z + TranslatorPoint.z);
		return point;
	}
}
