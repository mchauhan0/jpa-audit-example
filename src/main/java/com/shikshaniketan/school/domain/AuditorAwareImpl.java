/**
 * 
 */
package com.shikshaniketan.school.domain;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * @author egcho
 *
 */
@Component
public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public String getCurrentAuditor() {
		// TODO Auto-generated method stub
		
		/*
 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication == null || !authentication.isAuthenticated()) {
      return null;
    }

    return ((MyUserDetails) authentication.getPrincipal()).getUser();		
		*/
		
		return "HIMANSHU";
	}

}
