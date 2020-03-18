package main;

public class Constants {

	private int fieldSizeWidth;
	private int fieldSizeHeight;
	
	public Constants () {
		initConstants();
	}
	
	public void initConstants() {
		setFieldSizeHeight(720);
		setFieldSizeWidth(1280);
	}

	public int getFieldSizeHeight() {
		return fieldSizeHeight;
	}

	public void setFieldSizeHeight(int fieldSizeHeight) {
		this.fieldSizeHeight = fieldSizeHeight;
	}

	public int getFieldSizeWidth() {
		return fieldSizeWidth;
	}

	public void setFieldSizeWidth(int fieldSizeWidth) {
		this.fieldSizeWidth = fieldSizeWidth;
	}
}
