(function () {
  'use strict';

  angular.module("ngApp").service("cursosAPI", function ($http, config) {

    var _getCursos = function () {
  		return $http.get(config.baseUrl + "/curso");
  	};

  	var _saveCurso = function (curso) {
  		return $http.post(config.baseUrl + "/curso", curso);
  	};

    var _updateCurso = function (curso) {
  		return $http.put(config.baseUrl + "/curso", curso);
  	};

    var _deleteCurso = function (id) {
  		return $http.delete(config.baseUrl + "/curso/"+id);
    };
  	return {
  		getCursos: _getCursos,
  		saveCurso: _saveCurso,
      updateCurso : _updateCurso,
      deleteCurso: _deleteCurso
  	};
  });

  })();
