package com.rihuisoft.mobilecheck.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * 用户
 * @author liang
 *
 */
@XmlRootElement(name = "MobileInfo")
public class MobileInfo {
	private int id;
	private String Brand;
    private String Model;
    private String Version;
    private String Memory;
    private String 	Storage;
    private String IMEI;
    private String RootState;
    private String SimLock;
    private String WifiState;
    private String GpsState;
    private String Bluetooth;
    private String Fingerprint;
    private String Speaker;
    private String Vibration;
    private String FlashlightState;
    private String FrontCamera;
    private String BackCamera;
    private String Gyroscope;
    private String Orientation;
    private String Acceleration;
    private String Dbvalue;
    private String DeadPixel;
    private String Appearance;
    private String Battery_Status;
    protected String create_time;
    private String update_time ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getRootState() {
        return RootState;
    }

    public void setRootState(String rootState) {
        RootState = rootState;
    }

    public String getSimLock() {
        return SimLock;
    }

    public void setSimLock(String simLock) {
        SimLock = simLock;
    }

    public String getWifiState() {
        return WifiState;
    }

    public void setWifiState(String wifiState) {
        WifiState = wifiState;
    }

    public String getGpsState() {
        return GpsState;
    }

    public void setGpsState(String gpsState) {
        GpsState = gpsState;
    }

    public String getBluetooth() {
        return Bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        Bluetooth = bluetooth;
    }

    public String getFingerprint() {
        return Fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        Fingerprint = fingerprint;
    }

    public String getSpeaker() {
        return Speaker;
    }

    public void setSpeaker(String speaker) {
        Speaker = speaker;
    }

    public String getVibration() {
        return Vibration;
    }

    public void setVibration(String vibration) {
        Vibration = vibration;
    }

    public String getFlashlightState() {
        return FlashlightState;
    }

    public void setFlashlightState(String flashlightState) {
        FlashlightState = flashlightState;
    }

    public String getFrontCamera() {
        return FrontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        FrontCamera = frontCamera;
    }

    public String getBackCamera() {
        return BackCamera;
    }

    public void setBackCamera(String backCamera) {
        BackCamera = backCamera;
    }

    public String getGyroscope() {
        return Gyroscope;
    }

    public void setGyroscope(String gyroscope) {
        Gyroscope = gyroscope;
    }

    public String getOrientation() {
        return Orientation;
    }

    public void setOrientation(String orientation) {
        Orientation = orientation;
    }

    public String getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(String acceleration) {
        Acceleration = acceleration;
    }

    public String getDbvalue() {
        return Dbvalue;
    }

    public void setDbvalue(String dbvalue) {
        Dbvalue = dbvalue;
    }

    public String getDeadPixel() {
        return DeadPixel;
    }

    public void setDeadPixel(String deadPixel) {
        DeadPixel = deadPixel;
    }

    public String getAppearance() {
        return Appearance;
    }

    public void setAppearance(String appearance) {
        Appearance = appearance;
    }

    public String getBattery_Status() {
        return Battery_Status;
    }

    public void setBattery_Status(String battery_Status) {
        Battery_Status = battery_Status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public MobileInfo(){
		super();
	}

	public MobileInfo(int id,String Brand,String Version,String Memory,String 	Storage,String IMEI,String RootState,
					  String SimLock,String WifiState,String GpsState,String Bluetooth,String Fingerprint,
					  String Speaker,String Vibration,String FlashlightState,String FrontCamera,
					  String BackCamera,String Gyroscope,String Orientation,String Acceleration,
					  String Dbvalue,String DeadPixel,String Appearance,String Battery_Status,
					  String create_time,String update_time ) {
		super();
		this.id = id;
		this.Brand = Brand;
		this.Version = Version;
		this.Memory = Memory;
		this.Storage = Storage;
		this.IMEI = IMEI;
		this.RootState = RootState;
		this.SimLock = SimLock;
		this.WifiState = WifiState;
		this.GpsState = GpsState;
		this.Bluetooth = Bluetooth;
		this.Fingerprint = Fingerprint;
		this.Speaker = Speaker;
		this.Vibration = Vibration;
		this.FlashlightState = FlashlightState;
		this.FrontCamera = FrontCamera;
		this.BackCamera = BackCamera;
		this.Gyroscope = Gyroscope;
		this.Orientation = Orientation;
		this.Acceleration = Acceleration;
		this.DeadPixel = DeadPixel;
		this.Appearance = Appearance;
		this.Battery_Status = Battery_Status;
		this.create_time = create_time;
		this.update_time = update_time;
	}
}
