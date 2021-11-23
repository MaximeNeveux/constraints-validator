package net.tncy.mne.constraintsvalidator;

import java.lang.annotation.*;
import javax.validation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ISBNValidator.class)
@Documented
public @interface ISBN {

    String message() default "{net.tncy.validator.constraints.books.ISBN}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}

