package jcrystal.clients;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientAngular{
	public String id() default "angular";
}
