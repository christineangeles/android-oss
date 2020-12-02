package com.kickstarter.services;

import com.kickstarter.services.apiresponses.EmailVerificationResponseEnvelope;
import com.kickstarter.services.apiresponses.InternalBuildEnvelope;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface WebService {
  @GET("/mobile/beta/ping")
  Observable<Response<InternalBuildEnvelope>> pingBeta();

  /**
   * Sample call to verify email service "/profile/verify_email?at={TOKEN}&ref=ksr_email_user_email_verification"
   * @param token
   * @return
   */
  @GET("/profile/verify_email")
  Observable<Response<EmailVerificationResponseEnvelope>> verifyEmail(@Query("at") String token,
                                                                      @Query("ref") String ref);
}
