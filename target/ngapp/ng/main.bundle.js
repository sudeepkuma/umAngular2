webpackJsonp([1,4],{

/***/ 100:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__(106);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__(108);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__(114);




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["enableProdMode"])();
}
__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 107:
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
        template: __webpack_require__(175)
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ 108:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(18);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__(105);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__(62);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_tabs__ = __webpack_require__(174);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_tabs___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_ng2_tabs__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_routing__ = __webpack_require__(109);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__app_component__ = __webpack_require__(107);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__home_page_employee_list_component__ = __webpack_require__(64);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__shared_components_settings_settings_component__ = __webpack_require__(68);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__shared_components_admin_admin_component__ = __webpack_require__(65);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__home_page_nav_bar_component__ = __webpack_require__(110);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__shared_components_settings_algemene_component__ = __webpack_require__(67);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__shared_components_employees_employee_tab_algemeen_setting_Algemeen_setting_component__ = __webpack_require__(112);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__shared_components_employees_employee_detail_component__ = __webpack_require__(66);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__shared_components_employees_employee_tab_Inzet_inzet_component__ = __webpack_require__(111);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__shared_services_employee_service__ = __webpack_require__(35);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__angular_common__ = __webpack_require__(17);
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
        declarations: [__WEBPACK_IMPORTED_MODULE_6__app_component__["a" /* AppComponent */], __WEBPACK_IMPORTED_MODULE_7__home_page_employee_list_component__["a" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_7__home_page_employee_list_component__["a" /* EmployeeListComponent */], __WEBPACK_IMPORTED_MODULE_8__shared_components_settings_settings_component__["a" /* SettingComponent */],
            __WEBPACK_IMPORTED_MODULE_9__shared_components_admin_admin_component__["a" /* AdminComponent */], __WEBPACK_IMPORTED_MODULE_10__home_page_nav_bar_component__["a" /* NavBar */], __WEBPACK_IMPORTED_MODULE_11__shared_components_settings_algemene_component__["a" /* AlgemeneComponent */], __WEBPACK_IMPORTED_MODULE_13__shared_components_employees_employee_detail_component__["a" /* EmployeeDetailComponent */], __WEBPACK_IMPORTED_MODULE_12__shared_components_employees_employee_tab_algemeen_setting_Algemeen_setting_component__["a" /* AlgemeenSettingComponent */],
            __WEBPACK_IMPORTED_MODULE_14__shared_components_employees_employee_tab_Inzet_inzet_component__["a" /* InzetComponent */]
        ],
        imports: [__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */], __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */], __WEBPACK_IMPORTED_MODULE_3__angular_http__["a" /* HttpModule */], __WEBPACK_IMPORTED_MODULE_5__app_routing__["a" /* routing */], __WEBPACK_IMPORTED_MODULE_4_ng2_tabs__["TabsModule"]],
        providers: [__WEBPACK_IMPORTED_MODULE_15__shared_services_employee_service__["a" /* EmployeeService */], __WEBPACK_IMPORTED_MODULE_16__angular_common__["DatePipe"]],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_6__app_component__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ 109:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_router__ = __webpack_require__(63);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__home_page_employee_list_component__ = __webpack_require__(64);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_components_settings_settings_component__ = __webpack_require__(68);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_components_admin_admin_component__ = __webpack_require__(65);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__shared_components_settings_algemene_component__ = __webpack_require__(67);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__shared_components_employees_employee_detail_component__ = __webpack_require__(66);
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

/***/ 110:
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
        template: __webpack_require__(177)
    })
], NavBar);

//# sourceMappingURL=nav-bar.component.js.map

/***/ }),

/***/ 111:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return InzetComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var InzetComponent = (function () {
    function InzetComponent() {
    }
    return InzetComponent;
}());
InzetComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'inzet',
        template: __webpack_require__(180),
        styles: [__webpack_require__(171)]
    })
], InzetComponent);

//# sourceMappingURL=inzet.component.js.map

/***/ }),

/***/ 112:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_employee__ = __webpack_require__(113);
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
        template: __webpack_require__(181),
        styles: [__webpack_require__(172)]
    })
], AlgemeenSettingComponent);

var _a;
//# sourceMappingURL=Algemeen-setting.component.js.map

/***/ }),

/***/ 113:
/***/ (function(module, exports) {

//# sourceMappingURL=employee.js.map

/***/ }),

/***/ 114:
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

/***/ 169:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(16)();
// imports


// module
exports.push([module.i, "\n.table-hover thead tr:hover th, .table-hover tbody tr:hover td {\n    background-color: lightgray;\n}\nthead{\n    background-color: \t\t\tblack;\n}\ntable, td, th {    \n    border: 1px solid #ddd;\n    text-align: left;\n    \n}\n\ntable {\n    border-collapse: collapse;\n    width: 100%;\n    height: 100%;\n}\n\nth, td {\n    padding: 15px;\n}\n .panel-heading {\n  background-color: #A93226;\n  height: 50%;\n}\n.container{\n     margin-top: 60px;\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 170:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(16)();
// imports


// module
exports.push([module.i, ".content {\n     height: 100%; \n   margin-right: 16px;\n   \n    width: 100%;\n   padding-bottom: 58px;\n}\n.tabset{\n  background-color: \ttomato;\n}\n.tab-pills{\n  background-color: \ttomato;\n}\n.tab-content{\n  margin-top: 5px;\n    clear: none;\n}\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 171:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(16)();
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 172:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(16)();
// imports


// module
exports.push([module.i, ".panel-body{\r\n    height: 200px;\r\n    \r\n}\r\n.text-nowrap {\r\n    white-space: nowrap;\r\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ 175:
/***/ (function(module, exports) {

module.exports = "<div>\n<nav-bar></nav-bar>\n<div class='container' >\n\t<router-outlet></router-outlet>\n</div>\n</div>\n"

/***/ }),

/***/ 176:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\n\t\n\t<div class='panel-heading'>\n\t{{ pageTitle }}\n\t</div>\n\t\n\t<div class='panel-body'>\n\t\t\n\t\t<div class='row'>\n\t\t\t<div class='col-md-2'>Filter by Unit:</div>\n\t\t\t<div class='col-md-4'>\n\t\t\t\t<input type='text' />\n\t\t\t</div>\n\t\t</div>\n\t\t\n\t\t<div class=\"row\"></div><br>\n\t\t\n\t\t<div class='table-responsive' style=\"overflow-x:auto;\">\n\t\t\t<table class=\"table table-striped table-hover table-responsive\">\n\t\t\t\t<thead>\n\t\t\t\t\t<tr style=\"color:white\">\n\t\t\t\t\t\t<th>Employee Number</th>\n\t\t\t\t\t\t<th>FirstName</th>\n\t\t\t\t\t\t<th>LastName</th>\n\t\t\t\t\t\t<th>DateOfBirth</th>\n\t\t\t\t\t\t<th>TelephoneNumber</th>\n\t\t\t\t\t</tr>\n\t\t\t\t</thead>\n\t\t\t\t<tbody>\n\t\t\t\t\t<tr *ngFor=\"let employ of employee\">\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Number}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Fname}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.Lname}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.DOB | date}}</td>\n\t\t\t\t\t\t<td a [routerLink]=\"['/details',employ.Id]\">{{employ.TelphoneNo}}</td>\n\t\t\t\t\t</tr>\n\t\t\t\t</tbody>\n\t\t\t</table>\n\t\t</div>\n\t\t\n\t</div>\n\n</div>"

/***/ }),

/***/ 177:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n\t<nav class=\"navbar navbar-default\">\n\t\t<div class='container-fluid'>\t\t\n\t\t\t<a class='navbar-brand' style=\"color: tomato;font-family: Arial, Helvetica, sans-serif;font-weight: bold\">{{pageTitle}}</a>\n\t\t\t\t\n\t\t\t<ul class='nav navbar-nav'>\n\t\t\t\t<li><a routerLink=\"/home\"><b style=\"color: black\">Home Page</b></a></li>\n\t\t\t\t<li><a routerLink=\"/settings\"><b style=\"color: black\">Instellingen</b></a></li>\n\t\t\t\t\t\n\t\t\t</ul>\n\n\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n\t\t\t\t<li><a routerLink=\"/admin\"><span\n\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span><b style=\"color: black\"> Admin</b></a></li>\n\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>\n\t\t\t\t\t\t<b style=\"color: black\">Sign Out</b></a></li>\n\t\t\t</ul>\n\n\t\t</div>\n\t</nav>\n</div>"

/***/ }),

/***/ 178:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\n\t\n\t<div class='panel-heading'>\n\t{{ admin }}\n\t</div>\n\t\n\t<div class='panel-body'>\n\n\t\t\n\t</div>\n\n\n</div>"

/***/ }),

/***/ 179:
/***/ (function(module, exports) {

module.exports = "<b style=\"color:black;font-family: Arial, Helvetica, sans-serif;font-weight: bold;font-size: x-large\">{{employee.Fname}} &nbsp; {{employee.Lname}}</b>\n<div class=\"row\" style=\"border: 1px solid #F0F0F0\">\n    \n<div class=\"col-md-10\" style=\"border: 1px solid #F0F0F0\" >\n                \n                    <!-- Nav tabs -->\n    <tabset [pills]=\"true\">\n        <tab title=\"Algemeen\">\n          <div class=\"tab-content\">  <algemeen [employe]= \"employee\"></algemeen></div>\n        </tab>\n        <tab title=\"Inzet\">\n            <div class=\"tab-content\"><inzet></inzet></div>\n        </tab>\n        <tab title=\"Planning\" >\n            <div class=\"tab-content\"> Content of the Planning Tab</div>\n        </tab>\n        <tab title=\"SEI-Dialoog\" >\n            <div class=\"tab-content\"> Content of the SEI-Dialoog Tab</div>\n        </tab>\n        <tab title=\"GMI\" >\n             <div class=\"tab-content\">Content of the GMI Tab</div>\n        </tab>\n        <tab title=\"Gesprekken\" >\n            <div class=\"tab-content\"> Content of the Gesprekken Tab</div>\n        </tab>\n        <tab title=\"Acties\" >\n            <div class=\"tab-content\"> Content of the Acties Tab</div>\n        </tab>\n        <tab title=\"Document\" >\n             <div class=\"tab-content\">Content of the Document Tab</div>\n        </tab>\n    </tabset>           \n </div>\n\n <div class=\"col-md-2\" style=\"border: 1px solid black ; font-family: Arial, Helvetica, sans-serif\">\n     <img src=\"\" class=\"rounded mx-auto d-block \" alt=\"Responsive image\">\n    <h5>{{employee.Number}}</h5>\n    <h5>{{employee.Fname}}</h5>\n    <h5>{{employee.Lname}}</h5>\n    <h5>{{employee.TelphoneNo}}</h5>\n    <h5>{{employee.DOB | date}}</h5>\n\n </div>\n\n</div>\n\n               \n\n"

/***/ }),

/***/ 180:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n        <input type=\"button\" value=\"Nieuwe Opdracht\"/>\r\n        <div class=\"row\">\r\n            <div class=\"col-md-10\">\r\n        <div class = \"panel panel-default\" style=\"margin-top: 5px\">\r\n\r\n                <div class = \"panel-heading\">\r\n                 Opdracht\r\n                 </div>     \r\n                    <div class = \"panel-body\"> \r\n                     <div class=\"row\">\r\n                         <div class=\"col-md-4\">\r\n                             <div class=\"col-md-2\" style=\"font-weight: bold\">Inzet van:</div>\r\n                             <div class=\"col-md-2\" style=\"font-weight: bold\">\r\n                                 \r\n                             </div>\r\n                         </div>\r\n                          <div class=\"col-md-4\">\r\n                              <div class=\"col-md-2\" style=\"font-weight: bold\">Inzet tot:</div>\r\n                              <div class=\"col-md-2\" style=\"font-weight: bold\">Inzet van:</div>\r\n                          </div>  \r\n                     </div>\r\n                    </div>\r\n                    <div class = \"panel-heading\">\r\n                     Extra informatie over de opdracht\r\n                    </div>                  \r\n                        <div class = \"panel-body\"> \r\n                         body\r\n                        </div>\r\n            </div>\r\n            </div>\r\n        </div>\r\n             \r\n</div>\r\n"

/***/ }),

/***/ 181:
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n<div class = \"row\">\r\n<div class=\"col-md-5\">\r\n    <div class = \"panel panel-default\" >\r\n   <div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">\r\n        Personalia\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Leeftijd:</div>\r\n        <div class=\"col-md-2\">{{employe.Age}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Geslacht:</div>\r\n        <div class=\"col-md-2\">{{employe.Gender}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Geboren:</div>\r\n        <div class=\"col-md-2\"><span class=\"text-nowrap\">{{employe.DOB | date}}</span></div>\r\n    </div>\r\n</div>\r\n            \r\n    </div>\r\n</div>\r\n<div class=\"col-md-5\">\r\n                   <div class = \"panel panel-default\">\r\n   <div class = \"panel-heading\">\r\n     <h3 class = \"panel-title\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">\r\n         Dienstverband\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\"><span class=\"text-nowrap\">Datum in Dienst:</span></div>\r\n        <div class=\"col-md-2\" ><span class=\"text-nowrap\">{{employe.StartDate | date}}</span></div>\r\n    </div>\r\n        <div class=\"row\">\r\n        <div class=\"col-md-3\">Dienstjaren:</div>\r\n        <div class=\"col-md-2\">{{employe.Service_Years}}</div>\r\n    </div>\r\n        <div class=\"row\">\r\n        <div class=\"col-md-3\">Dienstverband:</div>\r\n        <div class=\"col-md-2\">{{employe.FTE}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Functie:</div>\r\n        <div class=\"col-md-2\"><span class=\"text-nowrap\">{{employe.Function_Level}}&nbsp;{{employe.Function_Name}}</span></div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\">Beloningsbudget:</div>\r\n        <div class=\"col-md-2\">{{employe.Base_Salary}}</div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-3\"><span class=\"text-nowrap\">Prestatie bonus:</span></div>\r\n        <div class=\"col-md-2\">{{employe.Bonus}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Perf. bonus:</div>\r\n        <div class=\"col-md-2\">{{employe.Performance_Bonus}}</div>\r\n    </div>\r\n\r\n   </div>  \r\n    </div>\r\n</div>\r\n\r\n</div>\r\n\r\n<div class = \"row\">\r\n<div class=\"col-md-5\">\r\n    <div class = \"panel panel-default\">\r\n   <div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">\r\n       Algemene informatie\r\n      </h3>\r\n   </div>\r\n   \r\n   <div class = \"panel-body\">\r\n   <textarea cols=\"50\" rows=\"8\" value=\"Algemeen\"></textarea>\r\n    </div>\r\n            \r\n    </div>\r\n</div>\r\n<div class=\"col-md-5\" >\r\n<div class = \"panel panel-default\">\r\n<div class = \"panel-heading\">\r\n      <h3 class = \"panel-title\" style=\"font-weight: bold;font-family: Arial, Helvetica, sans-serif\">\r\n      Overige\r\n      </h3>\r\n</div>\r\n   \r\n   <div class = \"panel-body\">\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\">Ziekmeldingen:</div>\r\n        <div class=\"col-md-1\">{{employe.TimesSick}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\">Ziektedagen:</div>\r\n        <div class=\"col-md-1\">{{employe.SickDays}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Vak. Uren (wet):</span></div>\r\n        <div class=\"col-md-1\">{{employe.VakantieWettelijk}}</div>\r\n    </div>\r\n   <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Vak Uren (bov. wet):</span></div>\r\n        <div class=\"col-md-1\">{{employe.VakantieBovenWettelijk}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-3\">Lease Auto:</div>\r\n        <div class=\"col-md-2\"><span class=\"text-nowrap\">{{employe.LeaseAuto}}</span></div>\r\n    </div>\r\n     <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Lease Bedrag:</span></div>\r\n        <div class=\"col-md-1\">{{employe.LeaseCarAmount}}</div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-4\"><span class=\"text-nowrap\">Einde Contract Datum:</span></div>\r\n        <div class=\"col-md-1\"><span class=\"text-nowrap\">{{employe.Einde_contract | date}}</span></div>\r\n    </div>\r\n   </div>  \r\n    </div>\r\n</div>\r\n\r\n</div>\r\n</div>\r\n"

/***/ }),

/***/ 182:
/***/ (function(module, exports) {

module.exports = "<h1>\r\n\r\nHello\r\n\r\n</h1>"

/***/ }),

/***/ 183:
/***/ (function(module, exports) {

module.exports = "<div class='panel panel-primary'>\r\n    \r\n    <div class='panel-heading'>\r\n    {{ settings }}\r\n    </div>\r\n    \r\n    <div class='container-fluid'>\r\n              <ul class='nav nav-tabs'>\r\n                  <li class=\"active\"><a data-toggle=\"tab\" routerLink=\"/algemene\">Algemene Settings</a></li>\r\n                  <li><a routerLink=\"/signaleringen\">Signaleringen</a></li>\r\n                  <li><a routerLink=\"/temporaryUnitmanager\">Temporary Unit manager</a></li>                    \r\n              </ul>\r\n        \r\n    </div>\r\n      <div class='container'>\r\n          <router-outlet></router-outlet>\r\n      </div> \r\n\r\n</div>"

/***/ }),

/***/ 220:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(100);


/***/ }),

/***/ 35:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__(62);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__(2);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__ = __webpack_require__(85);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_toPromise__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__ = __webpack_require__(189);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_operator_catch__ = __webpack_require__(188);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]) === "function" && _a || Object])
], EmployeeService);

var _a;
//# sourceMappingURL=employee.service.js.map

/***/ }),

/***/ 64:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__ = __webpack_require__(35);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_toPromise__ = __webpack_require__(85);
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
        template: __webpack_require__(176),
        styles: [__webpack_require__(169)]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__shared_services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object])
], EmployeeListComponent);

var _a;
//# sourceMappingURL=employee-list.component.js.map

/***/ }),

/***/ 65:
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
        template: __webpack_require__(178),
    })
], AdminComponent);

//# sourceMappingURL=admin.component.js.map

/***/ }),

/***/ 66:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_employee_service__ = __webpack_require__(35);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__(63);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_switchMap__ = __webpack_require__(190);
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
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
        selector: 'employee-detail',
        template: __webpack_require__(179),
        styles: [__webpack_require__(170)]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_employee_service__["a" /* EmployeeService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* ActivatedRoute */]) === "function" && _b || Object])
], EmployeeDetailComponent);

var _a, _b;
//# sourceMappingURL=employee-detail.component.js.map

/***/ }),

/***/ 67:
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
        template: __webpack_require__(182)
    })
], AlgemeneComponent);

//# sourceMappingURL=algemene.component.js.map

/***/ }),

/***/ 68:
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
        template: __webpack_require__(183)
    })
], SettingComponent);

//# sourceMappingURL=settings.component.js.map

/***/ }),

/***/ 99:
/***/ (function(module, exports) {

function webpackEmptyContext(req) {
	throw new Error("Cannot find module '" + req + "'.");
}
webpackEmptyContext.keys = function() { return []; };
webpackEmptyContext.resolve = webpackEmptyContext;
module.exports = webpackEmptyContext;
webpackEmptyContext.id = 99;


/***/ })

},[220]);
//# sourceMappingURL=main.bundle.js.map