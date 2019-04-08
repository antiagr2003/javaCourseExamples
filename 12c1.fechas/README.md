
# Tratamiento de fechas con Java

### Clase java.util.Date

Clase para definir un tipo fecha, ya que trabaja con la información en milisegundos. A continuación se resumen los métodos no *deprectaed* de la clase java.util.Date. Como norma, para la generación y tratamiento de fechas se trabajará con Calendar


```Java
Date fecha1 = new Date()
```


```Java
fecha1
```




    Mon Apr 08 13:09:47 GMT 2019




```Java
Date fecha2 = new Date()
```


```Java
fecha1
```




    Mon Apr 08 13:09:47 GMT 2019




```Java
fecha2
```




    Mon Apr 08 13:09:48 GMT 2019




```Java
fecha1.before(fecha2)
```




    true




```Java
fecha1.after(fecha2)
```




    false




```Java
long fechaMillis = fecha1.getTime()
```


```Java
fechaMillis
```




    1554728987880



### Clase java.util.Calendar


```Java
Calendar fecha = Calendar.getInstance()
```


```Java
fecha
```




    java.util.GregorianCalendar[time=1554728989611,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=98,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=9,SECOND=49,MILLISECOND=611,ZONE_OFFSET=0,DST_OFFSET=0]




```Java
fecha.get(Calendar.DAY_OF_MONTH)
```




    8




```Java
fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH)+1) + "/" + fecha.get(Calendar.YEAR)
```




    8/4/2019



Operaciones con fechas


```Java
fecha.add(Calendar.DAY_OF_MONTH, 2)
```


```Java
fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH)+1) + "/" + fecha.get(Calendar.YEAR)
```




    10/4/2019




```Java
fecha.add(Calendar.DAY_OF_MONTH, -2)
```


```Java
fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH)+1) + "/" + fecha.get(Calendar.YEAR)
```




    8/4/2019



### Conversiones entre clases

##### De Date a Calendar


```Java
Date fechaDate = fecha.getTime()
```


```Java
fechaDate
```




    Mon Apr 08 13:09:49 GMT 2019



##### De Calendar a Date


```Java
Calendar fechaCalendar = Calendar.getInstance()
```


```Java
fechaCalendar.setTime(fechaDate)
```


```Java
fecha
```




    java.util.GregorianCalendar[time=1554728989611,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=98,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=9,SECOND=49,MILLISECOND=611,ZONE_OFFSET=0,DST_OFFSET=0]



### SimpleDateFormat

##### Formateando la salida


```Java
import java.text.SimpleDateFormat;
```


```Java
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
System.out.println(dateFormat.format(fechaCalendar.getTime()));
```

    08/04/2019



```Java

```
