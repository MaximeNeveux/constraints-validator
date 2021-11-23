package net.tncy.mne.constraintsvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ISBNValidator implements ConstraintValidator<ISBN, String> {
    
    @Override
    public void initialize(ISBN constraintAnnotation) {
        // Ici le validateur peut accéder aux attribut de l’annotation.
    }

    @Override
    public boolean isValid(String bookNumber, ConstraintValidatorContext constraintContext) {
        boolean valid = false;
        return valid;
    }
}
