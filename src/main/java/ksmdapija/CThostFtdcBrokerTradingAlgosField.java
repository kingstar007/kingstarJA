package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\u3de8<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:3594</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcBrokerTradingAlgosField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u05b2\u05b4\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHandlePositionAlgoIDType
	 */
	@Field(3) 
	public byte HandlePositionAlgoID() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\u05b2\u05b4\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHandlePositionAlgoIDType
	 */
	@Field(3) 
	public CThostFtdcBrokerTradingAlgosField HandlePositionAlgoID(byte HandlePositionAlgoID) {
		this.io.setByteField(this, 3, HandlePositionAlgoID);
		return this;
	}
	/**
	 * \u0470\ufffd\u04b1\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFindMarginRateAlgoIDType
	 */
	@Field(4) 
	public byte FindMarginRateAlgoID() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u0470\ufffd\u04b1\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFindMarginRateAlgoIDType
	 */
	@Field(4) 
	public CThostFtdcBrokerTradingAlgosField FindMarginRateAlgoID(byte FindMarginRateAlgoID) {
		this.io.setByteField(this, 4, FindMarginRateAlgoID);
		return this;
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHandleTradingAccountAlgoIDType
	 */
	@Field(5) 
	public byte HandleTradingAccountAlgoID() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\u3de8\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHandleTradingAccountAlgoIDType
	 */
	@Field(5) 
	public CThostFtdcBrokerTradingAlgosField HandleTradingAccountAlgoID(byte HandleTradingAccountAlgoID) {
		this.io.setByteField(this, 5, HandleTradingAccountAlgoID);
		return this;
	}
	public CThostFtdcBrokerTradingAlgosField() {
		super();
	}
	public CThostFtdcBrokerTradingAlgosField(Pointer pointer) {
		super(pointer);
	}
}