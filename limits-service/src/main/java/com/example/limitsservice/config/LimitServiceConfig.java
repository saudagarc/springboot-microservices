package com.example.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitServiceConfig {
	int maximum;
	int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	@Override
	public String toString() {
		return "LimitServiceConfig [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
	
	
}
