import { Injectable } from '@angular/core';
import { HttpClient} from "@angular/common/http";
import { Observable} from "rxjs";
import { Employee} from "./employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseURL = "http://localhost:8081/api/v1/employees";
  constructor(private httpClient :HttpClient) { }

  getEmployeeList(): Observable<Employee[]>
  {
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee :Employee) :Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,employee);
  }
}

