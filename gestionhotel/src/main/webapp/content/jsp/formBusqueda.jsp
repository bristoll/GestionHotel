<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container">
  <h2>BUSQUEDA</h2>
  <form action="/clientes/listaLibres">
    <div class="form-group">
      <label for="number">NumPersonas</label>
      <input type="number" class="form-control" id="numPersonas" placeholder="numPersonas" name="numPersonas">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>