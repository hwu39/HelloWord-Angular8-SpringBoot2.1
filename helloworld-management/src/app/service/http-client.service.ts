import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Student {
  constructor(
    public studentId: string,
    public firstname: string,
    public lastname: string,
    public major: string,
    public course: string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { }

  getStudents() {
    console.log("test");
    return this.httpClient.get<Student[]>(
      'http://localhost:8080/students'
    );
  }
}
