# FlexValidation

[![codecov](https://codecov.io/gh/tentenponce/FlexValidation/branch/master/graph/badge.svg)](https://codecov.io/gh/tentenponce/FlexValidation)
[![Build Status](https://travis-ci.org/tentenponce/FlexValidation.svg?branch=master)](https://travis-ci.org/tentenponce/FlexValidation)
[ ![Download](https://api.bintray.com/packages/tentenponce/FlexValidation/com.tcorner.flexvalidation/images/download.svg) ](https://bintray.com/tentenponce/FlexValidation/com.tcorner.flexvalidation/_latestVersion)

Simple, flexible, and highly extensible form validations.

### Why use this?
- Can be easily plugged into your project no matter what architecture you are using.
- Highly extensible, create your own validations!
- Just exactly what you need, pure validation classes only.
- Less than 25KB!!!

---
### How to use

Add this on the `dependencies` block of your app level `build.gradle`.
```
android {
  ...
}

dependencies {
  ...
  implementation "com.tcorner:flexvalidation:<latest version here>"
}
```

---
### Simply use the validation you want:

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

---
### Create your own validation!

**Kotlin**
```
class YourValidation: Validation() {
  override fun isValid(o: Any): Boolean {
    // your logic here, check first for data type of parameter o
  }
}
```
**Java**
```
public class YourValidation extends Validation {
  @Override
  public boolean isValid(Object o) {
    // your logic here, check first for data type of parameter o 
  }
}
```

---
### You can also combine multiple validations:

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
) // returns the first validation object that fails
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
); // returns the first validation object that fails
```

### Author
Exequiel Egbert V. Ponce, poncetenten10@gmail.com
