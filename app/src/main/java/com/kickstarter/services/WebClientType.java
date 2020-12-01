package com.kickstarter.services;

import com.kickstarter.services.apiresponses.EmailVerificationResponseEnvelope;
import com.kickstarter.services.apiresponses.InternalBuildEnvelope;

import rx.Observable;

public interface WebClientType {
  Observable<InternalBuildEnvelope> pingBeta();
  Observable<EmailVerificationResponseEnvelope> verifyEmail(String token);
}
