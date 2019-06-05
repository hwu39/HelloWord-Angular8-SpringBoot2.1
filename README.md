# HelloWorld-Angular8.0.1-SpringBoot2.1

Wtih Angular 8.0.1, this is a simple hello world maven project to test how Spring Boot works with Angular. 

SpringBootHelloWorld.java is the main class as the Spring Boot driver. Student.java is a subclass used for creating
Student objects. TestController.java is to test the Student class by instantiating multiple student objects and 
adding each of them to an ArrayList.

To display the ArrayList on port 8080/students, produces="application/json" is included to parse it as JSON.

To initialize a student management Angular project, use ng new student-management. 
To compile the project, use ng serve. The default Angular page is displayed on port 4200.
To generate a student component, use ng generate component student.
To set up the router to get student information, add 
```javascript
import { StudentComponent } from './student/student.component';

const routes: Routes = [
  { path:'', component: StudentComponent},
];
```
Now, to generate an HTTP service, run the command ng generate service service/httpClient. 
In http-client.service.t, to make connect to the Spring Boot application, use the httpClient object:
```javascript
import { HttpClient } from '@angular/common/http';

export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     getStudents()
  {
    return this.httpClient.get<Student[]>('http://localhost:8080/students');
  }
}
```

Add the HTTP client module to app.module.ts:
```javascript
import { HttpClientModule } from '@angular/common/http';
...
imports: [
    ...
    HttpClientModule
  ],
```

Now, use a constructor dependency injection to fetch the student list from the Spring Boot Application in the student component
```javascript
constructor(
    private httpClientService:HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getStudents().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );
```
Edit student.component.html to display the student list.
