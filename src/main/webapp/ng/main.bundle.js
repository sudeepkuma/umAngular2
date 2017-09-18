webpackJsonp([1,4],{

/***/ 139:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__ = __webpack_require__(63);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__(279);
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
        this.pageTitle = 'List Of Employees';
    }
    EmployeeListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._employeeService.getEmployees()
            .subscribe(function (employee) { return _this.employee = employee; }, function (error) { return _this.errorMessage = error; });
    };
    return EmployeeListComponent;
}());
EmployeeListComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'emp-list',
        template: __webpack_require__(380),
        styles: [__webpack_require__(371)]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object])
], EmployeeListComponent);

var _a;
//# sourceMappingURL=employee-list.component.js.map

/***/ }),

/***/ 140:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'settings',
        template: __webpack_require__(382),
    })
], AdminComponent);

//# sourceMappingURL=admin.component.js.map

/***/ }),

/***/ 141:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_employee_service__ = __webpack_require__(63);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__(45);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_switchMap__ = __webpack_require__(396);
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
        this.multiple = true;
        this.myPlaceholderText = 'Select an option';
        this.canClearSelect = true;
    }
    EmployeeDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.sub = this.route.params.subscribe(function (params) {
            var id = +params['Id'];
            _this.getEmployee(id);
        });
        this.employeeService.getEmployees()
            .subscribe(function (employee) { return _this.employees = employee; }, function (error) { return _this.errorMessage = error; });
    };
    EmployeeDetailComponent.prototype.getEmployee = function (id) {
        var _this = this;
        alert("id is" + id);
        this.employeeService.getEmployee(id).subscribe(function (employee) { return _this.employee = employee; }, function (error) { return _this.errorMessage = error; });
        alert("Employee called" + this.employee.Fname);
    };
    EmployeeDetailComponent.prototype.OnInput = function ($event) {
        $event.preventDefault();
        //this.employeeService.getEmployee($event.target.value).
        //);subscribe(
        //  employee => this.employee = employee,
        //  error => this.errorMessage = <any>error
        alert("Value passed is" + $event.target.value);
    };
    return EmployeeDetailComponent;
}());
EmployeeDetailComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'employee-detail',
        template: __webpack_require__(383),
        styles: [__webpack_require__(372)],
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */]) === "function" && _b || Object])
], EmployeeDetailComponent);

var _a, _b;
//# sourceMappingURL=employee-detail.component.js.map

/***/ }),

/***/ 142:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'settings',
        template: __webpack_require__(386)
    })
], SettingComponent);

//# sourceMappingURL=settings.component.js.map

/***/ }),

/***/ 143:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'algemeneSettings',
        template: __webpack_require__(387),
        styles: [__webpack_require__(375)]
    })
], AlgemeneComponent);

//# sourceMappingURL=algemene.component.js.map

/***/ }),

/***/ 144:
/***/ (function(module, exports) {

//# sourceMappingURL=employee.js.map

/***/ }),

/***/ 145:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__(3);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return InzetService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var InzetService = (function () {
    function InzetService(http) {
        this.http = http;
        this.inzetPost = 'http://localhost:8080/ngapp/rest/employeeService/postttHere';
        this.inzetGet = 'http://localhost:8080/ngapp/rest/employeeService/inzet/';
    }
    InzetService.prototype.setInzetaData = function (inzetVandate, inzetTot, id) {
        this.startDateTime = inzetVandate;
        this.employee_id = id;
        this.inzetTot = inzetTot;
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]({
            'Content-Type': 'application/json'
        });
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]({ headers: headers });
        var inzetData = [{ inzetdate: this.startDateTime, inzetTot: this.inzetTot, id: this.employee_id }];
        this.http.post(this.inzetPost, inzetData, options)
            .subscribe();
        alert("inside service" + this.startDateTime + this.employee_id);
    };
    InzetService.prototype.getInzetData = function (id) {
        var _this = this;
        return this.http.get(this.inzetGet + id)
            .map(function (response) {
            _this.inzet = response.json();
            return _this.inzet;
        }).catch(this.handleError);
    };
    InzetService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["Observable"].throw(error.json().error || 'Server error');
    };
    return InzetService;
}());
InzetService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */]) === "function" && _a || Object])
], InzetService);

var _a;
//# sourceMappingURL=inzet.service.js.map

/***/ }),

/***/ 293:
/***/ (function(module, exports) {

function webpackEmptyContext(req) {
	throw new Error("Cannot find module '" + req + "'.");
}
webpackEmptyContext.keys = function() { return []; };
webpackEmptyContext.resolve = webpackEmptyContext;
module.exports = webpackEmptyContext;
webpackEmptyContext.id = 293;


/***/ }),

/***/ 294:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__(299);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__(308);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__(316);




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["enableProdMode"])();
}
__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 307:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'pm-app',
        template: __webpack_require__(379)
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ 308:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__(9);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_tabs__ = __webpack_require__(378);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_tabs___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_ng2_tabs__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_routing__ = __webpack_require__(309);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__ng_bootstrap_ng_bootstrap__ = __webpack_require__(303);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_ng2_datepicker__ = __webpack_require__(275);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__index__ = __webpack_require__(311);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__shared_services_employee_service__ = __webpack_require__(63);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__shared_services_inzet_service__ = __webpack_require__(145);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__angular_common__ = __webpack_require__(6);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_core__["NgModule"])({
        declarations: [__WEBPACK_IMPORTED_MODULE_8__index__["a" /* AppComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["b" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["b" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["c" /* SettingComponent */],
            __WEBPACK_IMPORTED_MODULE_8__index__["d" /* AdminComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["e" /* NavBar */], __WEBPACK_IMPORTED_MODULE_8__index__["f" /* AlgemeneComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["g" /* EmployeeDetailComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["h" /* AlgemeenSettingComponent */],
            __WEBPACK_IMPORTED_MODULE_8__index__["i" /* InzetComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["j" /* SignaleringenComponent */], __WEBPACK_IMPORTED_MODULE_8__index__["k" /* temporaryUnitmanagerComponent */]
        ],
        imports: [__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */], __WEBPACK_IMPORTED_MODULE_3__angular_http__["a" /* HttpModule */], __WEBPACK_IMPORTED_MODULE_5__app_routing__["a" /* routing */], __WEBPACK_IMPORTED_MODULE_4_ng2_tabs__["TabsModule"], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["b" /* ReactiveFormsModule */], __WEBPACK_IMPORTED_MODULE_6__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot(), __WEBPACK_IMPORTED_MODULE_7_ng2_datepicker__["a" /* DatePickerModule */]],
        providers: [__WEBPACK_IMPORTED_MODULE_9__shared_services_employee_service__["a" /* EmployeeService */], __WEBPACK_IMPORTED_MODULE_11__angular_common__["DatePipe"], __WEBPACK_IMPORTED_MODULE_10__shared_services_inzet_service__["a" /* InzetService */]],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_8__index__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ 309:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_router__ = __webpack_require__(45);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__ = __webpack_require__(139);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__ = __webpack_require__(142);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__ = __webpack_require__(140);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__shared_components_settings_settings_tab_algemene_component__ = __webpack_require__(143);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_detail_component__ = __webpack_require__(141);
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
        component: __WEBPACK_IMPORTED_MODULE_4__shared_components_settings_settings_tab_algemene_component__["a" /* AlgemeneComponent */]
    }
];
var routing = __WEBPACK_IMPORTED_MODULE_0__angular_router__["a" /* RouterModule */].forRoot(appRoutes);
//# sourceMappingURL=app.routing.js.map

/***/ }),

/***/ 310:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NavBar; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var NavBar = (function () {
    function NavBar() {
        this.pageTitle = 'UM Dashboard';
    }
    return NavBar;
}());
NavBar = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'nav-bar',
        template: __webpack_require__(381)
    })
], NavBar);

//# sourceMappingURL=nav-bar.component.js.map

/***/ }),

/***/ 311:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__app_component__ = __webpack_require__(307);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__app_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__ = __webpack_require__(139);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "b", function() { return __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__ = __webpack_require__(142);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "c", function() { return __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__ = __webpack_require__(140);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "d", function() { return __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__home_page_nav_bar_component__ = __webpack_require__(310);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "e", function() { return __WEBPACK_IMPORTED_MODULE_4__home_page_nav_bar_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_tab_algemeen_setting_algemeen_setting_component__ = __webpack_require__(313);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "h", function() { return __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_tab_algemeen_setting_algemeen_setting_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__shared_components_employees_employee_detail_component__ = __webpack_require__(141);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "g", function() { return __WEBPACK_IMPORTED_MODULE_6__shared_components_employees_employee_detail_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__shared_components_employees_employee_tab_Inzet_inzet_component__ = __webpack_require__(312);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "i", function() { return __WEBPACK_IMPORTED_MODULE_7__shared_components_employees_employee_tab_Inzet_inzet_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__shared_components_settings_settings_tab_algemene_component__ = __webpack_require__(143);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "f", function() { return __WEBPACK_IMPORTED_MODULE_8__shared_components_settings_settings_tab_algemene_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__shared_components_settings_settings_tab_signaleringen_component__ = __webpack_require__(314);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "j", function() { return __WEBPACK_IMPORTED_MODULE_9__shared_components_settings_settings_tab_signaleringen_component__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__shared_components_settings_settings_tab_temporaryUnitmanager_component__ = __webpack_require__(315);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "k", function() { return __WEBPACK_IMPORTED_MODULE_10__shared_components_settings_settings_tab_temporaryUnitmanager_component__["a"]; });











//# sourceMappingURL=index.js.map

/***/ }),

/***/ 312:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_employee__ = __webpack_require__(144);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_employee___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1__models_employee__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ng2_datepicker__ = __webpack_require__(275);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_forms__ = __webpack_require__(9);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_inzet_service__ = __webpack_require__(145);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_router__ = __webpack_require__(45);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return InzetComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var InzetComponent = (function () {
    function InzetComponent(inzetService, route) {
        this.inzetService = inzetService;
        this.route = route;
        this.options = new __WEBPACK_IMPORTED_MODULE_2_ng2_datepicker__["b" /* DatePickerOptions */]();
        this.inzet = this.employe;
    }
    InzetComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.dateSelected = new __WEBPACK_IMPORTED_MODULE_3__angular_forms__["e" /* FormControl */]();
        this.dateInzetTot = new __WEBPACK_IMPORTED_MODULE_3__angular_forms__["e" /* FormControl */]();
        this.inzetData = new __WEBPACK_IMPORTED_MODULE_3__angular_forms__["f" /* FormGroup */]({
            dateSelected: this.dateSelected,
            dateInzetTot: this.dateInzetTot
        });
        this.date = {
            formatted: ''
        };
        this.dateTot = {
            formatted: ''
        };
        this.route.params.subscribe(function (params) {
            _this.inzetId = +params['Id'];
        });
        this.inzetService.getInzetData(this.inzetId).subscribe(function (inn) { return _this.inn = inn; }, function (error) { return _this.errorMessage = error; });
        alert('data in service is' + this.inn.Client_Name);
    };
    InzetComponent.prototype.postDate = function (inzetValues, id) {
        this.setdate = JSON.stringify((inzetValues.dateSelected.formatted));
        this.inzetTot = JSON.stringify((inzetValues.dateInzetTot.formatted));
        this.id = JSON.stringify(id);
        alert("data is " + this.setdate + this.inzetTot + this.id);
        this.inzetService.setInzetaData(this.setdate, this.inzetTot, this.id);
    };
    return InzetComponent;
}());
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__models_employee__["IEmployee"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__models_employee__["IEmployee"]) === "function" && _a || Object)
], InzetComponent.prototype, "employe", void 0);
InzetComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'inzet',
        providers: [{ provide: __WEBPACK_IMPORTED_MODULE_0__angular_core__["LOCALE_ID"],
                useValue: "nl-NL" }],
        template: __webpack_require__(384),
        styles: [__webpack_require__(373)]
    }),
    __metadata("design:paramtypes", [typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_4__services_inzet_service__["a" /* InzetService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_inzet_service__["a" /* InzetService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_5__angular_router__["b" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__angular_router__["b" /* ActivatedRoute */]) === "function" && _c || Object])
], InzetComponent);

var _a, _b, _c;
//# sourceMappingURL=inzet.component.js.map

/***/ }),

/***/ 313:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_employee__ = __webpack_require__(144);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_employee___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1__models_employee__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AlgemeenSettingComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AlgemeenSettingComponent = (function () {
    function AlgemeenSettingComponent() {
    }
    return AlgemeenSettingComponent;
}());
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__models_employee__["IEmployee"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__models_employee__["IEmployee"]) === "function" && _a || Object)
], AlgemeenSettingComponent.prototype, "employe", void 0);
AlgemeenSettingComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'algemeen',
        template: __webpack_require__(385),
        styles: [__webpack_require__(374)]
    })
], AlgemeenSettingComponent);

var _a;
//# sourceMappingURL=algemeen-setting.component.js.map

/***/ }),

/***/ 314:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SignaleringenComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var SignaleringenComponent = (function () {
    function SignaleringenComponent() {
        this.settings = 'SignaleringenSettings';
    }
    return SignaleringenComponent;
}());
SignaleringenComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'signaleringenSettings',
        template: __webpack_require__(388)
    })
], SignaleringenComponent);

//# sourceMappingURL=signaleringen.component.js.map

/***/ }),

/***/ 315:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return temporaryUnitmanagerComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var temporaryUnitmanagerComponent = (function () {
    function temporaryUnitmanagerComponent() {
        this.settings = 'temporaryUnitmanagerSettings';
    }
    return temporaryUnitmanagerComponent;
}());
temporaryUnitmanagerComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'temporaryUnitmanagerSettings',
        template: __webpack_require__(389)
    })
], temporaryUnitmanagerComponent);

//# sourceMappingURL=temporaryUnitmanager.component.js.map

/***/ }),

/***/ 316:
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

/***/ 371:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(18)();
// imports


// module
exports.push([module.i, "\r\n.table-hover thead tr:hover th, .table-hover tbody tr:hover td {\r\n    background-color: lightgray;\r\n}\r\nthead{\r\n    background-color: \t\t\tblack;\r\n}\r\ntable, td, th {    \r\n    border: 1px solid #ddd;\r\n    text-align: left;\r\n    \r\n}\r\n\r\ntable {\r\n    border-collapse: collapse;\r\n    width: 100%;\r\n    height: 100%;\r\n}\r\n\r\nth, td {\r\n    padding: 15px;\r\n}\r\n .panel-heading {\r\n  background-color: #A93226;\r\n  height: 50%;\r\n}\r\n.container{\r\n     margin-top: 60px;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 372:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(18)();
// imports


// module
exports.push([module.i, ".content {\r\n     height: 100%; \r\n     width: 100%;\r\n   padding-bottom: 58px;\r\n}\r\n.tabset{\r\n   background-color: \ttomato;\r\n}\r\n.tabDesign{\r\n  background-color: \ttomato;\r\n}\r\n.tab-pills{\r\n  background-color: \ttomato;\r\n}\r\n.tab-content{\r\n  margin-top: 5px;\r\n    clear: none;\r\n}\r\n.select{\r\nwidth: 8px;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 373:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(18)();
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 374:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(18)();
// imports


// module
exports.push([module.i, ".panel-body{\r\n    height: 200px;\r\n    font-size: 12px;\r\n    \r\n}\r\n.panel-title{\r\n    font-weight: bold;\r\n    font-family: Arial, Helvetica, sans-serif;\r\n}\r\n.text-nowrap {\r\n    white-space: nowrap;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 375:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(18)();
// imports


// module
exports.push([module.i, "div.cities {\r\n    background-color: black;\r\n    color: white;\r\n    margin: 20px 0 20px 0;\r\n    padding: 20px;\r\n}\r\n \r\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 377:
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"./af": 159,
	"./af.js": 159,
	"./ar": 166,
	"./ar-dz": 160,
	"./ar-dz.js": 160,
	"./ar-kw": 161,
	"./ar-kw.js": 161,
	"./ar-ly": 162,
	"./ar-ly.js": 162,
	"./ar-ma": 163,
	"./ar-ma.js": 163,
	"./ar-sa": 164,
	"./ar-sa.js": 164,
	"./ar-tn": 165,
	"./ar-tn.js": 165,
	"./ar.js": 166,
	"./az": 167,
	"./az.js": 167,
	"./be": 168,
	"./be.js": 168,
	"./bg": 169,
	"./bg.js": 169,
	"./bn": 170,
	"./bn.js": 170,
	"./bo": 171,
	"./bo.js": 171,
	"./br": 172,
	"./br.js": 172,
	"./bs": 173,
	"./bs.js": 173,
	"./ca": 174,
	"./ca.js": 174,
	"./cs": 175,
	"./cs.js": 175,
	"./cv": 176,
	"./cv.js": 176,
	"./cy": 177,
	"./cy.js": 177,
	"./da": 178,
	"./da.js": 178,
	"./de": 181,
	"./de-at": 179,
	"./de-at.js": 179,
	"./de-ch": 180,
	"./de-ch.js": 180,
	"./de.js": 181,
	"./dv": 182,
	"./dv.js": 182,
	"./el": 183,
	"./el.js": 183,
	"./en-au": 184,
	"./en-au.js": 184,
	"./en-ca": 185,
	"./en-ca.js": 185,
	"./en-gb": 186,
	"./en-gb.js": 186,
	"./en-ie": 187,
	"./en-ie.js": 187,
	"./en-nz": 188,
	"./en-nz.js": 188,
	"./eo": 189,
	"./eo.js": 189,
	"./es": 191,
	"./es-do": 190,
	"./es-do.js": 190,
	"./es.js": 191,
	"./et": 192,
	"./et.js": 192,
	"./eu": 193,
	"./eu.js": 193,
	"./fa": 194,
	"./fa.js": 194,
	"./fi": 195,
	"./fi.js": 195,
	"./fo": 196,
	"./fo.js": 196,
	"./fr": 199,
	"./fr-ca": 197,
	"./fr-ca.js": 197,
	"./fr-ch": 198,
	"./fr-ch.js": 198,
	"./fr.js": 199,
	"./fy": 200,
	"./fy.js": 200,
	"./gd": 201,
	"./gd.js": 201,
	"./gl": 202,
	"./gl.js": 202,
	"./gom-latn": 203,
	"./gom-latn.js": 203,
	"./he": 204,
	"./he.js": 204,
	"./hi": 205,
	"./hi.js": 205,
	"./hr": 206,
	"./hr.js": 206,
	"./hu": 207,
	"./hu.js": 207,
	"./hy-am": 208,
	"./hy-am.js": 208,
	"./id": 209,
	"./id.js": 209,
	"./is": 210,
	"./is.js": 210,
	"./it": 211,
	"./it.js": 211,
	"./ja": 212,
	"./ja.js": 212,
	"./jv": 213,
	"./jv.js": 213,
	"./ka": 214,
	"./ka.js": 214,
	"./kk": 215,
	"./kk.js": 215,
	"./km": 216,
	"./km.js": 216,
	"./kn": 217,
	"./kn.js": 217,
	"./ko": 218,
	"./ko.js": 218,
	"./ky": 219,
	"./ky.js": 219,
	"./lb": 220,
	"./lb.js": 220,
	"./lo": 221,
	"./lo.js": 221,
	"./lt": 222,
	"./lt.js": 222,
	"./lv": 223,
	"./lv.js": 223,
	"./me": 224,
	"./me.js": 224,
	"./mi": 225,
	"./mi.js": 225,
	"./mk": 226,
	"./mk.js": 226,
	"./ml": 227,
	"./ml.js": 227,
	"./mr": 228,
	"./mr.js": 228,
	"./ms": 230,
	"./ms-my": 229,
	"./ms-my.js": 229,
	"./ms.js": 230,
	"./my": 231,
	"./my.js": 231,
	"./nb": 232,
	"./nb.js": 232,
	"./ne": 233,
	"./ne.js": 233,
	"./nl": 235,
	"./nl-be": 234,
	"./nl-be.js": 234,
	"./nl.js": 235,
	"./nn": 236,
	"./nn.js": 236,
	"./pa-in": 237,
	"./pa-in.js": 237,
	"./pl": 238,
	"./pl.js": 238,
	"./pt": 240,
	"./pt-br": 239,
	"./pt-br.js": 239,
	"./pt.js": 240,
	"./ro": 241,
	"./ro.js": 241,
	"./ru": 242,
	"./ru.js": 242,
	"./sd": 243,
	"./sd.js": 243,
	"./se": 244,
	"./se.js": 244,
	"./si": 245,
	"./si.js": 245,
	"./sk": 246,
	"./sk.js": 246,
	"./sl": 247,
	"./sl.js": 247,
	"./sq": 248,
	"./sq.js": 248,
	"./sr": 250,
	"./sr-cyrl": 249,
	"./sr-cyrl.js": 249,
	"./sr.js": 250,
	"./ss": 251,
	"./ss.js": 251,
	"./sv": 252,
	"./sv.js": 252,
	"./sw": 253,
	"./sw.js": 253,
	"./ta": 254,
	"./ta.js": 254,
	"./te": 255,
	"./te.js": 255,
	"./tet": 256,
	"./tet.js": 256,
	"./th": 257,
	"./th.js": 257,
	"./tl-ph": 258,
	"./tl-ph.js": 258,
	"./tlh": 259,
	"./tlh.js": 259,
	"./tr": 260,
	"./tr.js": 260,
	"./tzl": 261,
	"./tzl.js": 261,
	"./tzm": 263,
	"./tzm-latn": 262,
	"./tzm-latn.js": 262,
	"./tzm.js": 263,
	"./uk": 264,
	"./uk.js": 264,
	"./ur": 265,
	"./ur.js": 265,
	"./uz": 267,
	"./uz-latn": 266,
	"./uz-latn.js": 266,
	"./uz.js": 267,
	"./vi": 268,
	"./vi.js": 268,
	"./x-pseudo": 269,
	"./x-pseudo.js": 269,
	"./yo": 270,
	"./yo.js": 270,
	"./zh-cn": 271,
	"./zh-cn.js": 271,
	"./zh-hk": 272,
	"./zh-hk.js": 272,
	"./zh-tw": 273,
	"./zh-tw.js": 273
};
function webpackContext(req) {
	return __webpack_require__(webpackContextResolve(req));
};
function webpackContextResolve(req) {
	var id = map[req];
	if(!(id + 1)) // check for number
		throw new Error("Cannot find module '" + req + "'.");
	return id;
};
webpackContext.keys = function webpackContextKeys() {
	return Object.keys(map);
};
webpackContext.resolve = webpackContextResolve;
module.exports = webpackContext;
webpackContext.id = 377;


/***/ }),

/***/ 379:
/***/ (function(module, exports) {

module.exports = "<div>\r\n<nav-bar></nav-bar>\r\n<div class='container' >\r\n\t<router-outlet></router-outlet>\r\n</div>\r\n</div>\r\n"

/***/ }),

/***/ 380:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\r\n\t\r\n\t<div class='panel-heading'>\r\n\t{{ pageTitle }}\r\n\t</div>\r\n\r\n\t\r\n\t<div class='panel-body'>\r\n\t\t\r\n\t\t<div class='row'>\r\n\t\t\t<div class='col-md-2'>Filter by Unit:</div>\r\n\t\t\t<div class='col-md-4'>\r\n\t\t\t\t<input type='text' />\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t\r\n\t\t<div class=\"row\"></div><br>\r\n\t\t\r\n\t\t<div class='table-responsive' style=\"overflow-x:auto;\">\r\n\t\t\t<table class=\"table table-striped table-hover table-responsive\">\r\n\t\t\t\t<thead>\r\n\t\t\t\t\t<tr style=\"color:white\">\r\n\t\t\t\t\t\t<th>Employee Number</th>\r\n\t\t\t\t\t\t<th>FirstName</th>\r\n\t\t\t\t\t\t<th>LastName</th>\r\n\t\t\t\t\t\t<th>DateOfBirth</th>\r\n\t\t\t\t\t\t<th>TelephoneNumber</th>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</thead>\r\n\t\t\t\t<tbody>\r\n\t\t\t\t\t<tr *ngFor=\"let employ of employee\">\r\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Number}}</td>\r\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Fname}}</td>\r\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Lname}}</td>\r\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.DOB | date}}</td>\r\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.TelphoneNo}}</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</tbody>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\t\t\r\n\t</div>\r\n\r\n</div>"

/***/ }),

/***/ 381:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n\t<nav class=\"navbar navbar-default\">\r\n\t\t<div class='container-fluid'>\t\t\r\n\t\t\t<a class='navbar-brand' style=\"color: tomato;font-family: Arial, Helvetica, sans-serif;font-weight: bold\">{{pageTitle}}</a>\r\n\t\t\t\t\r\n\t\t\t<ul class='nav navbar-nav'>\r\n\t\t\t\t<li><a routerLink=\"/home\"><b style=\"color: black\">Home Page</b></a></li>\r\n\t\t\t\t<li><a routerLink=\"/settings\"><b style=\"color: black\">Instellingen</b></a></li>\r\n\t\t\t\t\t\r\n\t\t\t</ul>\r\n\r\n\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n\t\t\t\t<li><a routerLink=\"/admin\"><span\r\n\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span><b style=\"color: black\"> Admin</b></a></li>\r\n\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>\r\n\t\t\t\t\t\t<b style=\"color: black\">Sign Out</b></a></li>\r\n\t\t\t</ul>\r\n\r\n\t\t</div>\r\n\t</nav>\r\n</div>"

/***/ }),

/***/ 382:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\n\t\n\t<div class='panel-heading'>\n\t{{ admin }}\n\t</div>\n\t\n\t<div class='panel-body'>\n\n\t\t\n\t</div>\n\n\n</div>"

/***/ }),

/***/ 383:
/***/ (function(module, exports) {

module.exports = "<b style=\"color:black;font-family: Arial, Helvetica, sans-serif;font-weight: bold;font-size: x-large\">\r\n    {{employee.Fname}} &nbsp; {{employee.Lname}}\r\n</b>\r\n\r\n<select   (input) =\"OnInput($event)\" >\r\n  <option *ngFor=\"let e of employees\" value=\"{{e.Id}}\" >{{e.Fname}}\r\n  </option>\r\n</select>\r\n\r\n<div class=\"row\" style=\"border: 1px solid #F0F0F0\">\r\n    \r\n<div class=\"col-md-10\" style=\"border: 1px solid #F0F0F0\" >\r\n                \r\n                    <!-- Nav tabs -->\r\n    <tabset [pills]=\"true\">\r\n        <tab title=\"Algemeen\" class=\"tabDesign\">\r\n          <div class=\"tab-content\">  <algemeen [employe]= \"employee\"></algemeen></div>\r\n        </tab>\r\n        <tab title=\"Inzet\">\r\n            <div class=\"tab-content\"><inzet [employe] =\"employee\"></inzet></div>\r\n        </tab>\r\n        <tab title=\"Planning\" >\r\n            <div class=\"tab-content\"> Content of the Planning Tab</div>\r\n        </tab>\r\n        <tab title=\"SEI-Dialoog\" >\r\n            <div class=\"tab-content\"> Content of the SEI-Dialoog Tab</div>\r\n        </tab>\r\n        <tab title=\"GMI\" >\r\n             <div class=\"tab-content\">Content of the GMI Tab</div>\r\n        </tab>\r\n        <tab title=\"Gesprekken\" >\r\n            <div class=\"tab-content\"> Content of the Gesprekken Tab</div>\r\n        </tab>\r\n        <tab title=\"Acties\" >\r\n            <div class=\"tab-content\"> Content of the Acties Tab</div>\r\n        </tab>\r\n        <tab title=\"Document\" >\r\n             <div class=\"tab-content\">Content of the Document Tab</div>\r\n        </tab>\r\n    </tabset>           \r\n </div>\r\n\r\n <div class=\"col-md-2\" style=\"border: 1px solid black ; font-family: Arial, Helvetica, sans-serif\">\r\n     <img src=\"\" class=\"rounded mx-auto d-block \" alt=\"Responsive image\">\r\n    <h5>{{employee.Number}}</h5>\r\n    <h5>{{employee.Fname}}</h5>\r\n    <h5>{{employee.Lname}}</h5>\r\n    <h5>{{employee.TelphoneNo}}</h5>\r\n    <h5>{{employee.DOB | date}}</h5>\r\n\r\n </div>\r\n\r\n</div>\r\n\r\n               \r\n\r\n"

/***/ }),

/***/ 384:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n    <input type=\"button\" value=\"Nieuwe Opdracht\"/>\r\n        <div class=\"row\">\r\n            <div class=\"col-md-10\">    \r\n                        <div class=\"panel panel-default\" style=\"width: 98.3333%; height: 300px;margin-top:5px\">\r\n                        <div class = \"panel-heading\">\r\n                                Opdracht\r\n                            </div> \r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 98.3333%; height: 450px\">\r\n\r\n\t\t\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t\t<form [formGroup]=\"inzetData\" (ngSubmit)=\"postDate(inzetData.value,employe.Id)\">  \r\n\t\t\t\t\t\t\t<table style=\"height:100%\" >\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tbody style=\"height:100%\">\r\n\t\t\t\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"4%\" height=\"25\" style=\"font-weight: bold;\">Inzet\r\n\t\t\t\t\t\t\t\t\t\tvan:</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"3%\" height=\"25\" >\r\n                                    <ng2-datepicker formControlName=\"dateSelected\" [options]=\"options\" [(ngModel)]=\"date.formatted\"></ng2-datepicker>\r\n                                    </td>\r\n\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"6%\" height=\"25\" style=\"font-weight: bold;\">Inzet tot:</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"18%\" height=\"25\" > \r\n                                    <ng2-datepicker formControlName=\"dateInzetTot\" [options]=\"options\" [(ngModel)]=\"dateTot.formatted\" ></ng2-datepicker></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"1%\" height=\"25\" style=\"font-weight: bold;\">Gerealiseerd\r\n\t\t\t\t\t\t\t\t\t\tUurtarief :</td>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\"  >{{employe.Uurtareif}}</td>\r\n\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"1%\" height=\"25\" style=\"font-weight: bold;\">\r\n\t\t\t\t\t\t\t\t\t\tRichtTarief : </td>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" *ngFor=\"let inzet of inn\">{{inzet.RichttariefValue}}</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"1%\" height=\"25\" style=\"font-weight: bold;\">  Afwijking :</td>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" ></td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</tbody>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t<div class = \"panel-heading\" style=\"font-weight:bold\">\r\n                                Extra informatie over de opdracht\r\n                            </div> \r\n                            <div class = \"panel-body\" > \r\n                                <textarea value=\"Algemeen\">{{employe.Description}}</textarea>\r\n                            </div>\r\n                            <td><button type=\"submit\" class=\"btn btn-primary\">Save</button></td>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>    \r\n                    </div>\r\n                </div>            \r\n        <div class=\"row\">\r\n            <div class=\"col-md-5\">\r\n                <div class=\"panel panel-default\">\r\n                    <div class=\"panel-heading\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">Klant</div>\r\n                     <div class=\"panel-body\" >\r\n                        <div class=\"row\">\r\n                            <div class=\"col-md-2\">\r\n                                NAME:\r\n                            </div>\r\n                            <div class=\"col-md-2\" *ngFor=\"let inzet of inn\">\r\n                                <input type=\"text\" value=\"{{inzet.Client_Name}}\">\r\n                            </div>\r\n                        </div>\r\n                     </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"col-md-5\">\r\n                <div class=\"panel panel-default\">\r\n                    <div class=\"panel-heading\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">Contact Gegevens</div>\r\n                    <div class=\"panel-body\">Panel Content2</div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"row\">\r\n            <div class=\"col-md-10\">\r\n               <div class=\"panel panel-default\">\r\n                    <div class=\"panel-heading\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">\r\n                        Opdrachtgeschiedenis\r\n                    </div>\r\n                    <div class=\"panel-body\">Panel Content2</div>\r\n                </div>\r\n            </div>\r\n        </div>      \r\n</div>"

/***/ }),

/***/ 385:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n<div class = \"row\">\r\n<div class=\"col-md-5\">\r\n    <div class = \"panel panel-default\" >\r\n   <div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\">\r\n        Personalia\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Leeftijd:</div>\r\n        <div class=\"col-md-2\">{{employe.Age}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Geslacht:</div>\r\n        <div class=\"col-md-2\">{{employe.Gender}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Geboren:</div>\r\n        <div class=\"col-md-2\"><span class=\"text-nowrap\">{{employe.DOB | date}}</span></div>\r\n    </div>\r\n</div>\r\n            \r\n    </div>\r\n</div>\r\n<div class=\"col-md-5\">\r\n                   <div class = \"panel panel-default\">\r\n   <div class = \"panel-heading\">\r\n     <h3 class = \"panel-title\">\r\n         Dienstverband\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\"><span class=\"text-nowrap\">Datum in Dienst:</span></div>\r\n        <div class=\"col-md-2\" ><span class=\"text-nowrap\">{{employe.StartDate | date}}</span></div>\r\n    </div>\r\n        <div class=\"row\">\r\n        <div class=\"col-md-3\">Dienstjaren:</div>\r\n        <div class=\"col-md-2\">{{employe.Service_Years}}</div>\r\n    </div>\r\n        <div class=\"row\">\r\n        <div class=\"col-md-3\">Dienstverband:</div>\r\n        <div class=\"col-md-2\">{{employe.FTE}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Functie:</div>\r\n        <div class=\"col-md-2\"><span class=\"text-nowrap\">{{employe.Function_Level}}&nbsp;{{employe.Function_Name}}</span></div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Beloningsbudget:</div>\r\n        <div class=\"col-md-2\">{{employe.Base_Salary}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\"><span class=\"text-nowrap\">Prestatie bonus:</span></div>\r\n        <div class=\"col-md-2\">{{employe.Bonus}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Perf. bonus:</div>\r\n        <div class=\"col-md-2\">{{employe.Performance_Bonus}}</div>\r\n    </div>\r\n\r\n   </div>  \r\n    </div>\r\n</div>\r\n\r\n</div>\r\n\r\n<div class = \"row\">\r\n<div class=\"col-md-5\">\r\n    <div class = \"panel panel-default\">\r\n   <div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\">\r\n       Algemene informatie\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n   <textarea cols=\"50\" rows=\"8\" value=\"Algemeen\"></textarea>\r\n    </div>\r\n            \r\n    </div>\r\n</div>\r\n<div class=\"col-md-5\">\r\n<div class = \"panel panel-default\">\r\n<div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\">\r\n      Overige\r\n      </h3>\r\n</div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\">Ziekmeldingen:</div>\r\n        <div class=\"col-md-1\">{{employe.TimesSick}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\">Ziektedagen:</div>\r\n        <div class=\"col-md-1\">{{employe.SickDays}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Vak. Uren (wet):</span></div>\r\n        <div class=\"col-md-1\">{{employe.VakantieWettelijk}}</div>\r\n    </div>\r\n   <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Vak Uren (bov. wet):</span></div>\r\n        <div class=\"col-md-1\">{{employe.VakantieBovenWettelijk}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\">Lease Auto:</div>\r\n        <div class=\"col-md-1\"><span class=\"text-nowrap\">{{employe.LeaseAuto}}</span></div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Lease Bedrag:</span></div>\r\n        <div class=\"col-md-1\">{{employe.LeaseCarAmount}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Einde Contract Datum:</span></div>\r\n        <div class=\"col-md-1\"><span class=\"text-nowrap\">{{employe.Einde_contract | date}}</span></div>\r\n    </div>\r\n   </div>  \r\n    </div>\r\n</div>\r\n\r\n</div>\r\n</div>\r\n"

/***/ }),

/***/ 386:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\r\n\t<div class='panel-heading'>\r\n\t{{ settings }}\r\n\t</div>\r\n<div class=\"panel-body\">\r\n\t\t<tabset> \r\n\t\t<tab title=\"AlgemeenSettings\"> <algemeneSettings></algemeneSettings></tab>\r\n\t\t<tab title=\"Signaleringen\"> <signaleringenSettings></signaleringenSettings></tab>\r\n\t\t<tab title=\"TemporaryUnitManager\"><temporaryUnitmanagerSettings></temporaryUnitmanagerSettings> </tab>\r\n\t\t</tabset>\r\n\t\t\t\r\n</div>\r\n</div>\r\n\r\n\r\n"

/***/ }),

/***/ 387:
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-default\">\r\n\r\n\r\n\t<div class=\"panel-heading\">\r\n\t\t<span class=\"label label-primary\">Home Page Instellingen</span>\r\n\t</div>\r\n\t<div class=\"panel-body\">\r\n\r\n\t\t<div class=\"row\">\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 141px\">\r\n\t\t\t\t\t<span class=\"label label-info\">Extra Veergave</span>\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 141px\">\r\n\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t<label style=\"width: 74%;\">Leeftijd</label> <input\r\n\t\t\t\t\t\t\t\ttype=\"checkbox\" value=\"\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t<label style=\"width: 74%;\">Telefoon</label> <input\r\n\t\t\t\t\t\t\t\ttype=\"checkbox\" value=\"\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t<label style=\"width: 74%;\">Ziektedagen</label> <input\r\n\t\t\t\t\t\t\t\ttype=\"checkbox\" value=\"\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 141px\">\r\n\t\t\t\t\t<span class=\"label label-info\">Signalering Weergave</span>\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 141px\">\r\n\t\t\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<tbody>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" value=\"\">CV</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" value=\"\">CV\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tPassport</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"8%\">\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"\"> <input type=\"text\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" value=\"\">FV</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" value=\"\">PG</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"checkbox\" value=\"\">KG</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t</tbody>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\r\n\r\n\t\t</div>\r\n\r\n\r\n\t\t<div class=\"row\">\r\n\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 106px\">\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 106px\">\r\n\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t<label>Aantal Regels</label> <input type=\"text\"\r\n\t\t\t\t\t\t\t\tclass=\"form-control\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 106px\">\r\n\t\t\t\t\t<span class=\"label label-info\">Sorteervolgorde Hoofdscherm</span>\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 106px\">\r\n\t\t\t\t\t\t<div class=\"radio-inline\">\r\n\t\t\t\t\t\t\t<label><input type=\"radio\" value=\"\">Voornaam</label>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"radio-inline\">\r\n\t\t\t\t\t\t\t<label><input type=\"radio\" value=\"\">Achternaam</label>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"radio-inline\">\r\n\t\t\t\t\t\t\t<label><input type=\"radio\" value=\"\">Personeelsnummer</label>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\t\t</div>\r\n\t</div>\r\n</div>\r\n\r\n\r\n<div class=\"panel panel-default\">\r\n\r\n\r\n\t<div class=\"panel-heading\">\r\n\t\t<span class=\"label label-primary\">Employee Viewer Instellingen</span>\r\n\t</div>\r\n\t<div class=\"panel-body\">\r\n\r\n\r\n\t\t<div class=\"row\">\r\n\t\t\t<div class=\"col-md-6\">\r\n\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 316px\">\r\n\t\t\t\t\t<span class=\"label label-info\">Gesprekken</span>\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 316px\">\r\n\r\n\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n\t\t\t\t\t\t\t<span class=\"label label-info\">Rapporten</span> <label></label>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Per Periode(dagen)</label> <input\r\n\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Aantal</label> <input type=\"text\"\r\n\t\t\t\t\t\t\t\t\tclass=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n\t\t\t\t\t\t\t<span class=\"label label-info\">view</span> <label></label>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Per Periode(dagen)</label> <input\r\n\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Aantal</label> <input type=\"text\"\r\n\t\t\t\t\t\t\t\t\tclass=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 100.3333%; height: 316px\">\r\n\t\t\t\t\t<span class=\"label label-info\">Acties</span>\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 316px\">\r\n\r\n\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n\t\t\t\t\t\t\t<span class=\"label label-info\">Rapporten</span> <label></label>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Per Periode(dagen)</label> <input\r\n\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Aantal</label> <input type=\"text\"\r\n\t\t\t\t\t\t\t\t\tclass=\"\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n\t\t\t\t\t\t\t<span class=\"label label-info\">View</span> <label></label>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Per Periode (dagen)</label> <input\r\n\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"\" id=\"usr\"> <input type=\"radio\"\r\n\t\t\t\t\t\t\t\t\tvalue=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"form-group\">\r\n\t\t\t\t\t\t\t\t<label style=\"width: 46%;\">Aantal</label> <input type=\"text\"\r\n\t\t\t\t\t\t\t\t\tclass=\"\" id=\"usr\"> <input type=\"radio\" value=\"\">\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>\r\n\r\n\r\n<div class=\"panel panel-default\">\r\n\t<div class=\"panel-heading\">\r\n\t\t<span class=\"label label-primary\">ReportType</span>\r\n\t</div>\r\n\t<div class=\"panel-body\">\r\n\r\n\t\t<div class=\"col-md-6\">\r\n\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\tstyle=\"width: 80.3333%; height: 144px\">\r\n\t\t\t\t<span class=\"label label-info\">ReportType</span>\r\n\t\t\t\t<div class=\"panel-body\" style=\"width: 80.3333%; height: 144px\">\r\n\t\t\t\t\t<div class=\"radio\">\r\n\t\t\t\t\t\t<label style=\"width: 80%;\">Short Report</label> <input\r\n\t\t\t\t\t\t\ttype=\"radio\" value=\"\">\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div class=\"radio\">\r\n\t\t\t\t\t\t<label style=\"width: 80%;\">Long Report</label> <input type=\"radio\"\r\n\t\t\t\t\t\t\tvalue=\"\">\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>\r\n\r\n"

/***/ }),

/***/ 388:
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-default\">\r\n\t<div class=\"panel-heading\">\r\n\t\t<span class=\"label label-primary\">Signaleringen</span>\r\n\t</div>\r\n\t<div class=\"panel-body\">\r\n\r\n\t\t<div class=\"row\">\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 170.3333%; height: 405px\">\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 102.3333%; height: 405px\">\r\n\r\n\t\t\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<thead>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<th></th>\r\n\t\t\t\t\t\t\t\t\t\t<th>mild</th>\r\n\t\t\t\t\t\t\t\t\t\t<th>middel</th>\r\n\t\t\t\t\t\t\t\t\t\t<th>belangrijk</th>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</thead>\r\n\t\t\t\t\t\t\t\t<tbody>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">POP</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">FB</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">FV</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">OB</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">PG</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">CV</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">CV Passport</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">Einde Inzet</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">JUBILEE</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">BIRTHDATE</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">PR</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">SEI</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"10%\">KG</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"26%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"27%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"25%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<label>weekdagen</label>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</tbody>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>"

/***/ }),

/***/ 389:
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-default\">\r\n\t<div class=\"panel-heading\">\r\n\t\t<span class=\"label label-primary\">Update Temporary Unit Manager</span>\r\n\t</div>\r\n\t<div class=\"panel-body\">\r\n\r\n\t\t<div class=\"row\">\r\n\t\t\t<div class=\"col-md-6\">\r\n\t\t\t\t<div class=\"panel panel-default\"\r\n\t\t\t\t\tstyle=\"width: 170.3333%; height: 230px\">\r\n\t\t\t\t\t<div class=\"panel-body\" style=\"width: 100.3333%; height: 230px\">\r\n\r\n\t\t\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<tbody>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"3%\">Unit</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"dropdown\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary dropdown-toggle\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"button\" data-toggle=\"dropdown\">Dropdown button\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"3%\">Temporary Unit Manager</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"10%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-danger\">Verwijderen</button>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td scope=\"row\" width=\"3%\">Update Unit Manager</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"1%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"dropdown\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary dropdown-toggle\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"button\" data-toggle=\"dropdown\">Dropdown button\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</tbody>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</div>"

/***/ }),

/***/ 429:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(294);


/***/ }),

/***/ 63:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__(3);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__(279);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__ = __webpack_require__(395);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_catch__ = __webpack_require__(394);
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
        alert("cu" + custs[0]);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */]) === "function" && _a || Object])
], EmployeeService);

var _a;
//# sourceMappingURL=employee.service.js.map

/***/ })

},[429]);
//# sourceMappingURL=main.bundle.js.map