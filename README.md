# TimeDateFormatter

[![](https://jitpack.io/v/Wildanafian/TimeDateFormatter.svg)](https://jitpack.io/#Wildanafian/TimeDateFormatter)

Android kotlin based time and date formatter library

## Preparation

**Step 1.** Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.** Add the dependency
```
dependencies {
	        implementation 'com.github.Wildanafian:TimePower:latest-release'
	}
```
  
## Main feature
**Current date**
```
 getCurrentDate()  //default date format dd MM yyyy
 getCurrentDate(your date format)  //date with your format
 getDateAfterCurrentDate()
 getDateAfterCurrentDate(your date format)

 ex:
 getCurrentDate(dd/MM/yyyy)
 TextView.text = getCurrentDate(dd/MM/yyyy)
```

**Before and after date from current date**
```
 getDateBeforeCurrentDate(number)  //default date format dd MM yyyy
 getDateBeforeCurrentDate(outputDatePattern, number)

 ex:
 getDateBeforeCurrentDate(dd/MM/yyyy, 2)

//number = amount of date you want to jump *from current date*
//outputDatePattern = the desired date output format
```

**Formating date string**
```
formatDate(currentDatePattern, outputDatePattern, inputDate)   //default date format dd MM yyyy

ex:
formatDate(ddMMyyyy, dd/MM/yyyy HH:mm:ss , 12012021)

//inputDate = the date you want to convert
//currentDatePattern = the date pattern you want to convert
//outputDatePattern = the desired date output format
```
