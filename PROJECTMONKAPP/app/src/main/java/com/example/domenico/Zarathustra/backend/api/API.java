package com.example.domenico.Zarathustra.backend.api;

public class API {
	private API instance;
	//private BackEndMap backEndMap;

	private API() {
		//TODO request server file map
	}

	public API getInstance(){
		if(instance==null)
			instance = new API();
		return instance;
	}

	public boolean loginValidation(String user, String pw){
		if( user.equals("admin") && pw.equals("admin")){
			SharedPreferences.set("LoggedIn","True");
			return true;
		}
	}

	public boolean isSessionAlreadyStarted(){
		return SharedPreferences.get("LoggedIn").equals("True");
	}

	public boolean logout(){
		SharedPreferences.set("LoggedIn", "False");
	}

	/*public BackEndMap getMap(){
		if( backEndMap == null){
			backEndMap = makeMap();
		}
		return backEndMap;
	}

	private BackEndMap makeMap(){

	}

	private void reloadMap(){
		backEndMap = makeMap();
	}*/
	
}
/*
public class BackEndMap(){

}

public class Position{
	private int x,y,length;
	private Orientation orientation;
	public Enum Orientation{
		HORIZONTAL,
		VERTICAL;
	}

	public Position(int x, int y, int len, Orientation o){
		this.x=x;
		this.y=y;
		length=len;
		orientation=o;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public int getLength(){
		return this.length;
	}

	public Orientation getOrientation(){
		return this.orientation;
	}

}

public abstract class Item{
	public final int ID;
	protected Position position;
	protected boolean enabled;

	public Item(int ID, Position p){
		enabled = false;
		this.position = p;
	}

	public Position getPosition(){
		return this.position;
	}

	public boolean isEnabled(){
		return enabled;
	}

	public void enable(){
		enabled = true;
	}

	public void disable(){
		enabled = false;
	}
}

public class Light extends Item{
	public Light(int ID, Position p){
		super(ID, p);
	}
}

public class AirConditioner extends Item{
	public static final int MAX_TEMP = 30;
	public static final int MIN_TEMP = 16;
	public static final int MAX_WIND_SPD = 3;
	public static final int MIN_WIND_SPD = 1;
	private int temperature;
	private int windSpd;

	public AirConditioner(int ID, Position p){
		super(ID, p);
		temperature = 20;
		windSpd = 0;
	}

	public void setTemperature(int temp){
		temperature = temp;
		if(temprature>MAX_TEMP){
			temperature = MAX_TEMP;
		}else if(temperature<MIN_TEMP){
			disable();
		}
	}

	public void setWindSpd(int windSpd){
		if(windSpd>MAX_WIND_SPD){
			this.windSpd=MAX_WIND_SPD;
		}else if(windSpd<1){
			this.windSpd = 1;
		}else{
			this.windSpd = windSpd;
		}
	}

	public void disable(){
		super.disable();
		this.windSpd = 0;
	}
}

public class Shade(){
	//* le tapparelle sono aperte se enabled = true
	public Shade(int ID, Position p, boolean opened){
		super(ID, p);
		if(opened) super.enable();
	}

	public void open(){
		super.enable();
	}

	public void close(){
		super.disable();
	}

	public void isOpen(){
		return super.isEnabled();
	}
}
*/