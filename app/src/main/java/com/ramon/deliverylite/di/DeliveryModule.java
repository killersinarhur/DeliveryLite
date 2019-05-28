package com.ramon.deliverylite.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.ramon.deliverylite.persistence.Datastore;
import com.ramon.deliverylite.webservice.api.DeliveryApi;
import com.ramon.deliverylite.webservice.api.DeliveryClient;
import com.ramon.deliverylite.webservice.api.DeliveryEndpoint;
import com.ramon.deliverylite.webservice.configuration.InterceptorConfig;
import com.ramon.deliverylite.webservice.configuration.OkHttpManagerConfig;
import com.ramon.deliverylite.webservice.configuration.UnsafeHostnameVerifierConfig;
import com.ramon.deliverylite.webservice.configuration.UnsafeTrustManagerConfig;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.CertificatePinner;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class DeliveryModule {

    private final Application app;

    public DeliveryModule(Application app) {
        this.app = app;
    }

    @Provides
    public Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    public DeliveryClient provideDeliveryClient(Application app, DeliveryApi client) {
        return new DeliveryClient(app, client);
    }

    @Provides
    @Singleton
    public DeliveryApi provideDeliveryApi(OkHttpManagerConfig okHttpManager, GsonConverterFactory factory, DeliveryEndpoint endpoint) {
        return new Retrofit.Builder()
                .client(okHttpManager.getOkHttpClient())
                .addConverterFactory(factory)
                .baseUrl(endpoint.getEndpoint())
                .build()
                .create(DeliveryApi.class);
    }

    @Provides
    @Singleton
    public DeliveryEndpoint providesDeliveryEndpoint() {
        return new DeliveryEndpoint();
    }

    @Provides
    @Singleton
    public GsonConverterFactory provideConverterFactory() {
        return GsonConverterFactory.create();
    }


    @Provides
    @Singleton
    public OkHttpManagerConfig provideSolidOkHttpManager(UnsafeTrustManagerConfig unsafeTrustManager, CertificatePinner certificatePinner,
                                                         InterceptorConfig interceptor, UnsafeHostnameVerifierConfig unsafeHostnameVerifier) {
        return new OkHttpManagerConfig(unsafeTrustManager, certificatePinner, interceptor, unsafeHostnameVerifier);
    }

    @Provides
    @Singleton
    public CertificatePinner providesCertificatePinner() {
        return new CertificatePinner.Builder()

                .build();
    }

    @Provides
    @Singleton
    public UnsafeTrustManagerConfig provideUnsafeCertificateValidator() {
        return new UnsafeTrustManagerConfig();
    }


    @Provides
    @Singleton
    public Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public UnsafeHostnameVerifierConfig providesUnsafeHostnameVerifier() {
        return new UnsafeHostnameVerifierConfig();
    }

    @Provides
    @Singleton
    public InterceptorConfig provideInterceptor() {
        return new InterceptorConfig();
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPrefs(Application app){
        return PreferenceManager.getDefaultSharedPreferences(app);
    }

    @Singleton
    @Provides
    public Datastore provideDatastore(Gson gson,SharedPreferences preferences){
        return new Datastore(preferences,gson);
    }


}
