package javaProgrammerLevel1.interfaces;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface HandleInvalidTimeZoneClient extends TimeClient {

	public default ZonedDateTime getZonedDateTime(String zoneString) {
		try{
			return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString));
		}catch(DateTimeException e){
			System.err.println("Invalid zone ID: " + zoneString +
	                "; using the default time zone instead.");
		}
		return ZonedDateTime.of(getLocalDateTime(),ZoneId.systemDefault());
	}
}
