/**
 * 
 */
package com.shikshaniketan.school.transformer;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.AttributeConverter;

/**
 * @author egcho
 *
 */
public class LocalDateTimeConverter  implements AttributeConverter<LocalDateTime, Timestamp>{

	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
		// TODO Auto-generated method stub
		
		return Optional.ofNullable(localDateTime)
		        .map(Timestamp::valueOf)
		        .orElse(null);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {
		// TODO Auto-generated method stub
		  return Optional.ofNullable(timestamp)
			        .map(Timestamp::toLocalDateTime)
			        .orElse(null);
	}

}
