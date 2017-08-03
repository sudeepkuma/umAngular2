webpackJsonp([1,4],{

/***/ 102:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.pageTitle = 'UM DASHBOARD';
    }
    return AppComponent;
}());
AppComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'pm-app',
        template: __webpack_require__(162),
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ 103:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(16);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__(100);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__(59);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_routing__ = __webpack_require__(104);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_component__ = __webpack_require__(102);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__home_page_employee_list_component__ = __webpack_require__(61);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__shared_components_settings_settings_component__ = __webpack_require__(65);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__shared_components_admin_admin_component__ = __webpack_require__(62);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__home_page_nav_bar_component__ = __webpack_require__(105);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__shared_components_settings_algemene_component__ = __webpack_require__(64);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__shared_services_employee_service__ = __webpack_require__(33);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__shared_components_employees_employee_detail_component__ = __webpack_require__(63);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};













var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_core__["b" /* NgModule */])({
        declarations: [__WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* AppComponent */], __WEBPACK_IMPORTED_MODULE_6__home_page_employee_list_component__["a" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_6__home_page_employee_list_component__["a" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_7__shared_components_settings_settings_component__["a" /* SettingComponent */], __WEBPACK_IMPORTED_MODULE_8__shared_components_admin_admin_component__["a" /* AdminComponent */], __WEBPACK_IMPORTED_MODULE_9__home_page_nav_bar_component__["a" /* NavBar */], __WEBPACK_IMPORTED_MODULE_10__shared_components_settings_algemene_component__["a" /* AlgemeneComponent */], __WEBPACK_IMPORTED_MODULE_12__shared_components_employees_employee_detail_component__["a" /* EmployeeDetailComponent */]],
        imports: [__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */], __WEBPACK_IMPORTED_MODULE_3__angular_http__["a" /* HttpModule */], __WEBPACK_IMPORTED_MODULE_4__app_routing__["a" /* routing */]],
        providers: [__WEBPACK_IMPORTED_MODULE_11__shared_services_employee_service__["a" /* EmployeeService */]],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ 104:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_router__ = __webpack_require__(60);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__ = __webpack_require__(61);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__ = __webpack_require__(65);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__ = __webpack_require__(62);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__shared_components_settings_algemene_component__ = __webpack_require__(64);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_detail_component__ = __webpack_require__(63);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return routing; });






var appRoutes = [
    {
        path: 'details/:Id',
        component: __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_detail_component__["a" /* EmployeeDetailComponent */]
    },
    {
        path: '',
        redirectTo: '/home',
        pathMatch: 'full'
    },
    {
        path: 'settings',
        component: __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__["a" /* SettingComponent */]
    },
    {
        path: 'home',
        component: __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__["a" /* EmployeeListComponent */]
    },
    {
        path: 'admin',
        component: __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__["a" /* AdminComponent */]
    },
    {
        path: 'algemene',
        component: __WEBPACK_IMPORTED_MODULE_4__shared_components_settings_algemene_component__["a" /* AlgemeneComponent */]
    }
];
var routing = __WEBPACK_IMPORTED_MODULE_0__angular_router__["a" /* RouterModule */].forRoot(appRoutes);
//# sourceMappingURL=app.routing.js.map

/***/ }),

/***/ 105:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NavBar; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var NavBar = (function () {
    function NavBar() {
        this.pageTitle = 'UMDashboard';
    }
    return NavBar;
}());
NavBar = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'nav-bar',
        template: __webpack_require__(164)
    })
], NavBar);

//# sourceMappingURL=nav-bar.component.js.map

/***/ }),

/***/ 106:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
// The file contents for the current environment will overwrite these during build.
var environment = {
    production: false
};
//# sourceMappingURL=environment.js.map

/***/ }),

/***/ 162:
/***/ (function(module, exports) {

module.exports = "<nav-bar></nav-bar>\n<div class='container'>\n\t<router-outlet></router-outlet>\n</div>\n"

/***/ }),

/***/ 163:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\n\t\n\t<div class='panel-heading'>\n\t{{ pageTitle }}\n\t</div>\n\t\n\t<div class='panel-body'>\n\t\t\n\t\t<div class='row'>\n\t\t\t<div class='col-md-2'>Filter by Unit:</div>\n\t\t\t<div class='col-md-4'>\n\t\t\t\t<input type='text' />\n\t\t\t</div>\n\t\t</div>\n\t\t\n\t\t<div class=\"row\"></div><br>\n\t\t\n\t\t<div class='table-responsive' style=\"overflow-x:auto;\">\n\t\t\t<table class=\"table table-striped table-hover table-responsive\">\n\t\t\t\t<thead>\n\t\t\t\t\t<tr style=\"color:black\">\n\t\t\t\t\t\t<th>Employee Number</th>\n\t\t\t\t\t\t<th>FirstName</th>\n\t\t\t\t\t\t<th>LastName</th>\n\t\t\t\t\t\t<th>DateOfBirth</th>\n\t\t\t\t\t\t<th>TelephoneNumber</th>\n\t\t\t\t\t</tr>\n\t\t\t\t</thead>\n\t\t\t\t<tbody>\n\t\t\t\t\t<tr *ngFor=\"let employ of employee\">\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Number}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details' ]\">{{employ.Fname}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details']\">{{employ.Lname}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details']\">{{employ.DOB}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details']\">{{employ.TelphoneNo}}</td>\n\t\t\t\t\t</tr>\n\t\t\t\t</tbody>\n\t\t\t</table>\n\t\t</div>\n\t\t\n\t</div>\n\n</div>"

/***/ }),

/***/ 164:
/***/ (function(module, exports) {

module.exports = "<div>\n\t<nav class='navbar navbar-primary'>\n\t\t<div class='container-fluid'>\n\n\t\t\t<a class='navbar-brand'>{{pageTitle}}</a>\n\n\t\t\t<ul class='nav navbar-nav'>\n\t\t\t\t<li><a routerLink=\"/home\">Home Page</a></li>\n\t\t\t\t<li><a routerLink=\"/settings\">Instellingen</a></li>\n\t\t\t</ul>\n\n\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n\t\t\t\t<li><a routerLink=\"/admin\"><span\n\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> Admin</a></li>\n\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>\n\t\t\t\t\t\tSign Out</a></li>\n\t\t\t</ul>\n\n\t\t</div>\n\t</nav>\n</div>"

/***/ }),

/***/ 165:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\n\t\n\t<div class='panel-heading'>\n\t{{ admin }}\n\t</div>\n\t\n\t<div class='panel-body'>\n\n\t\t\n\t</div>\n\n\n</div>"

/***/ }),

/***/ 166:
/***/ (function(module, exports) {

module.exports = "{{employee.Fname}} &nbsp; {{employee.Lname}}\n<script src=\"https://code.jquery.com/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n<div class=\"row\">\n<div class=\"col-md-9\"  >\n                \n                    <!-- Nav tabs -->\n                <ul class=\"nav nav-tabs\" style=\"background-color:orange;\"> \n                    <li class=\"active\"><a data-toggle=\"tab\" routerLink=\"#algemene\">Algemeen</a></li>\n                    <li><a data-toggle=\"tab\" routerLink=\"#inzet\">Inzet</a></li>\n                    <li><a data-toggle=\"tab\" href=\"#planning\">Planning</a></li>\n                    <li><a data-toggle=\"tab\" href=\"#sei\">SEI Dialoog</a></li>\n                    <li><a data-toggle=\"tab\" href=\"#gmi\">GMI</a></li>\n                </ul>\n                    <!-- Tab panes -->\n                    <div class=\"tab-content\">\n                        <div class=\"tab-pane fade in active\" id=\"algemene\" >\n                            <h3>HOME</h3>                        \n                         </div>\n                        <div class=\"tab-pane fade\" id=\"inzet\" >\n                            <h3>Inzet</h3>\n                         </div>\n                          <div class=\"tab-pane  fade\" id=\"planning\" >\n                            <h3>Planning</h3>\n                         </div>\n                        <div  class=\"tab-pane fade\" id=\"sei\" >\n                            <h3>SEI</h3>\n                         </div>\n                        <div class=\"tab-pane fade\" id=\"gmi\">\n                            <h3>GMI</h3>                            \n                         </div>\n                    </div>                     \n </div>\n       \n <div class=\"col-md-1\" style=\"border: 1px solid brown\">\n    <h5>{{employee.Number}}</h5>\n    <h5>{{employee.Fname}}</h5>\n    <h5>{{employee.Lname}}</h5>\n    <h5 class=\"\">{{employee.DOB}}</h5>\n</div>\n</div>\n\n               \n\n"

/***/ }),

/***/ 167:
/***/ (function(module, exports) {

module.exports = "<h1>\r\n\r\nHello\r\n\r\n</h1>"

/***/ }),

/***/ 168:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\r\n    \r\n    <div class='panel-heading'>\r\n    {{ settings }}\r\n    </div>\r\n    \r\n    <div class='container-fluid'>\r\n              <ul class='nav nav-tabs'>\r\n                  <li class=\"active\"><a data-toggle=\"tab\" routerLink=\"/algemene\">Algemene Settings</a></li>\r\n                  <li><a routerLink=\"/signaleringen\">Signaleringen</a></li>\r\n                  <li><a routerLink=\"/temporaryUnitmanager\">Temporary Unit manager</a></li>                    \r\n              </ul>\r\n        \r\n    </div>\r\n      <div class='container'>\r\n          <router-outlet></router-outlet>\r\n      </div> \r\n\r\n</div>"

/***/ }),

/***/ 205:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(95);


/***/ }),

/***/ 33:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__(59);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__(80);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__ = __webpack_require__(174);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_catch__ = __webpack_require__(173);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_catch___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_catch__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EmployeeService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var EmployeeService = (function () {
    function EmployeeService(http) {
        this.http = http;
        this.employeesUrl = 'http://localhost:8080/ngapp/rest/employeeService/listOfEmployees';
        this.employeeDetail = 'http://localhost:8080/ngapp/rest/employeeService/employee';
    }
    EmployeeService.prototype.getEmployees = function () {
        var _this = this;
        return this.http.get(this.employeesUrl)
            .map(function (response) {
            _this.employees = response.json();
            return _this.employees;
        })
            .catch(this.handleError);
    };
    EmployeeService.prototype.getEmployee = function (Id) {
        if (this.employees) {
            //filter using cached data
            return this.findEmployeeObservable(Id);
        }
    };
    EmployeeService.prototype.findEmployeeObservable = function (id) {
        return this.createObservable(this.filterEmployees(id));
    };
    EmployeeService.prototype.filterEmployees = function (id) {
        var custs = this.employees.filter(function (cust) { return cust.Id === id; });
        return (custs.length) ? custs[0] : null;
    };
    EmployeeService.prototype.createObservable = function (data) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["Observable"].create(function (observer) {
            observer.next(data);
            observer.complete();
        });
    };
    EmployeeService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["Observable"].throw(error.json().error || 'Server error');
    };
    return EmployeeService;
}());
EmployeeService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]) === "function" && _a || Object])
], EmployeeService);

var _a;
//# sourceMappingURL=employee.service.js.map

/***/ }),

/***/ 61:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__ = __webpack_require__(33);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__(80);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EmployeeListComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var EmployeeListComponent = (function () {
    function EmployeeListComponent(_employeeService) {
        this._employeeService = _employeeService;
        this.pageTitle = 'List Of Employees ';
    }
    EmployeeListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._employeeService.getEmployees()
            .subscribe(function (employee) { return _this.employee = employee; }, function (error) { return _this.errorMessage = error; });
    };
    return EmployeeListComponent;
}());
EmployeeListComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'emp-list',
        template: __webpack_require__(163)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object])
], EmployeeListComponent);

var _a;
//# sourceMappingURL=employee-list.component.js.map

/***/ }),

/***/ 62:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AdminComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AdminComponent = (function () {
    function AdminComponent() {
        this.admin = 'Admin Settings';
    }
    return AdminComponent;
}());
AdminComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'settings',
        template: __webpack_require__(165),
    })
], AdminComponent);

//# sourceMappingURL=admin.component.js.map

/***/ }),

/***/ 63:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_employee_service__ = __webpack_require__(33);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__(60);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_switchMap__ = __webpack_require__(175);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_switchMap___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_switchMap__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EmployeeDetailComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var EmployeeDetailComponent = (function () {
    function EmployeeDetailComponent(employeeService, route) {
        this.employeeService = employeeService;
        this.route = route;
    }
    EmployeeDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.sub = this.route.params.subscribe(function (params) {
            var id = +params['Id'];
            _this.getEmployee(id);
        });
    };
    EmployeeDetailComponent.prototype.getEmployee = function (id) {
        var _this = this;
        this.employeeService.getEmployee(id).subscribe(function (employee) { return _this.employee = employee; }, function (error) { return _this.errorMessage = error; });
    };
    return EmployeeDetailComponent;
}());
EmployeeDetailComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'employee-detail',
        template: __webpack_require__(166)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */]) === "function" && _b || Object])
], EmployeeDetailComponent);

var _a, _b;
//# sourceMappingURL=employee-detail.component.js.map

/***/ }),

/***/ 64:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AlgemeneComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AlgemeneComponent = (function () {
    function AlgemeneComponent() {
        this.settings = 'AlgemeneSettings';
    }
    return AlgemeneComponent;
}());
AlgemeneComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'algemeneSettings',
        template: __webpack_require__(167)
    })
], AlgemeneComponent);

//# sourceMappingURL=algemene.component.js.map

/***/ }),

/***/ 65:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SettingComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var SettingComponent = (function () {
    function SettingComponent() {
        this.settings = 'Instellingen';
    }
    return SettingComponent;
}());
SettingComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* Component */])({
        selector: 'settings',
        template: __webpack_require__(168)
    })
], SettingComponent);

//# sourceMappingURL=settings.component.js.map

/***/ }),

/***/ 94:
/***/ (function(module, exports) {

function webpackEmptyContext(req) {
	throw new Error("Cannot find module '" + req + "'.");
}
webpackEmptyContext.keys = function() { return []; };
webpackEmptyContext.resolve = webpackEmptyContext;
module.exports = webpackEmptyContext;
webpackEmptyContext.id = 94;


/***/ }),

/***/ 95:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__(101);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__(103);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__(106);




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* enableProdMode */])();
}
__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ })

},[205]);
//# sourceMappingURL=main.bundle.js.map