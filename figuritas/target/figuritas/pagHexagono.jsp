<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="/ASSETS/img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="ASSETS/css/estiloHexagono.css">
    <title>Hexágono</title>
</head>
<body>
    <img src="/ASSETS/img/hexagono.png" alt="">
    <h2>Perimetro Hexágono</h2>
    <p>Para calcular el perimetro de un Hexágono regular necesitamos conocer uno de sus lados.</p>
    <h3>Fórmula: </h3>
    <p>P = L * 6</p>
    <form action="">
        <p>Ingresa el lado: </p>
        <input type="text" class="field"> <br/>
        <br>
        <p class="center-content">
            <input type="submit" class="btn btn-green" value="Calcular Perimetro">
        </p>
    </form>
    <p>El perimetro del Hexagono es: </p>
    <h2>Área Hexagono</h2>
    <p>Para calcular el área de un Hexágono regular necesitamos saber su perimetro y su apotema.</p>
    <h3>Fórmula: </h3>
    <p>A = (P * a)/2</p>
    <form action="">
        <p>Ingresa el Perimetro: </p>
        <input type="text" class="field"> 
        <p>Ingresa el Apotema: </p>
        <input type="text" class="field"> 
        <br>
        <p class="center-content">
            <input type="submit" class="btn btn-green" value="Calcular Area">
        </p>
    </form>
    <p>El área del Hexágono es: </p>
    <a href="index.jsp" class="button">Volver al Inicio</a>
</body>
</html>