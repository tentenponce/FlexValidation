# FlexValidation
Simple, flexible, and highly extensible form validations.

### Why use this?
- Can be easily plugged into your project no matter what architecture you are using.
- Highly extensible, create your own validations!
- Just exactly what you need, pure validation classes only.
- Less than 25KB!!!

### How to use

Add this on the `dependencies` block of your app level `build.gradle`.
```
android {
  ...
}

dependencies {
  ...
  implementation "com.tcorner:flexvalidation:1.0.2"
}
```

Simply use the validation you want:

**Kotlin**
```
AlphabetValidation().isValid("abc") // returns true
AlphabetValidation().isValid("abc123") // returns false
```
**Java**
```
new AlphabetValidation().isValid("abc"); // returns true
new AlphabetValidation().isValid("abc123"); // returns false
```

You can also combine multiple validations:

**Kotlin**
```
Validator.validate(
  "password123",
  arrayOf(
    RequiredValidation(),
    MinMaxValidation(8, 16),
    SpecialCharacterValidation(),
    LowerCaseValidation(),
    UpperCaseValidation(),
    NumberValidation()
  )
)
```

**Java**
```
Validator.INSTANCE.validate(
  "password123",
  new Validation[]{
    new RequiredValidation(),
    new MinMaxValidation(8, 16),
    new SpecialCharacterValidation(),
    new LowerCaseValidation(),
    new UpperCaseValidation(),
   new NumberValidation()
  }
);
```

### Author
Exequiel Egbert V. Ponce, poncetenten10@gmail.com
