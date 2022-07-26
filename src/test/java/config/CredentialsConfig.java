package config;

import org.aeonbits.owner.Config;

@Config.Sources("config/credentials.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();
    String selenoidURL();
}