package com.kickstarter.mock.services;

import com.kickstarter.services.WebClientType;
import com.kickstarter.services.apiresponses.EmailVerificationResponseEnvelope;
import com.kickstarter.services.apiresponses.InternalBuildEnvelope;

import androidx.annotation.NonNull;
import rx.Observable;

public class MockWebClient implements WebClientType {
  @Override
  public @NonNull Observable<InternalBuildEnvelope> pingBeta() {
    return Observable.empty();
  }

  @Override
  public Observable<EmailVerificationResponseEnvelope> verifyEmail(String token) {
    return Observable.empty();
  }
}
