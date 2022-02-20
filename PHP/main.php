<?php

include "Product.php";
include "Hardware.php";
include "Memory.php";

$laptop = new Memory();
$laptop2 = new Memory();

$laptop->setBrand("Dell");
$laptop->setModel("inspirion 8");
$laptop->setPrice("Rp. 12.500.000");
$laptop->setIdProduct("LD 08");
$laptop->setFrequency("18 Gbps");
$laptop->setMemorySize("128GB");
$laptop->setSupportsCuda("Support");

$laptop2->setBrand("hp");
$laptop2->setModel("pavillion gaming");
$laptop2->setPrice("Rp. 14.500.000");
$laptop2->setIdProduct("LH 04");
$laptop2->setFrequency("18 Gbps");
$laptop2->setMemorySize("128GB");
$laptop2->setSupportsCuda("Support");

echo "=========================================<br/>";
echo "Product ID : ". $laptop->getIdProduct(). "<br/>";
echo "Brand : ". $laptop->getBrand(). "<br/>";
echo "Model : ". $laptop->getModel(). "<br/>";
echo "Price : ". $laptop->getPrice(). "<br/>";
echo "Frequency : ". $laptop->getFrequency(). "<br/>";
echo "Memory Size : ". $laptop->getMemorySize(). "<br/>";
echo "Cuda Cores : ". $laptop->getSupportsCuda(). "<br/>";
echo "=========================================<br/>";

echo "=========================================<br/>";
echo "Product ID : ". $laptop2->getIdProduct(). "<br/>";
echo "Brand : ". $laptop2->getBrand(). "<br/>";
echo "Model : ". $laptop2->getModel(). "<br/>";
echo "Price : ". $laptop2->getPrice(). "<br/>";
echo "Frequency : ". $laptop2->getFrequency(). "<br/>";
echo "Memory Size : ". $laptop2->getMemorySize(). "<br/>";
echo "Cuda Cores : ". $laptop2->getSupportsCuda(). "<br/>";
echo "=========================================<br/>";

?>