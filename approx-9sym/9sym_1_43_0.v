// Benchmark "9sym/9sym_1_43_0_esp" written by ABC on Wed Mar  8 02:27:08 2023

module \9sym/9sym_1_43_0_esp  ( 
    i0, i1, i2, i3, i4, i5, i6, i7, i8,
    zori0  );
  input  i0, i1, i2, i3, i4, i5, i6, i7, i8;
  output zori0;
  wire new_n11_, new_n12_, new_n13_, new_n14_, new_n15_, new_n16_, new_n17_,
    new_n18_, new_n19_, new_n20_, new_n21_, new_n22_, new_n23_, new_n24_,
    new_n25_, new_n26_, new_n27_, new_n28_, new_n29_, new_n30_, new_n31_,
    new_n32_, new_n33_, new_n34_, new_n35_, new_n36_, new_n37_, new_n38_,
    new_n39_, new_n40_, new_n41_, new_n42_, new_n43_, new_n44_, new_n45_,
    new_n46_, new_n47_, new_n48_, new_n49_, new_n50_, new_n51_, new_n52_,
    new_n53_, new_n54_, new_n55_, new_n56_, new_n57_, new_n58_, new_n59_,
    new_n60_, new_n61_, new_n62_, new_n63_, new_n64_, new_n65_, new_n66_,
    new_n67_, new_n68_, new_n69_, new_n70_, new_n71_, new_n72_;
  INV        g00(.A(i2), .Y(new_n11_));
  NAi21      g01(.An(i5), .B(i3), .Y(new_n12_));
  NAi31      g02(.An(i3), .B(i8), .C(i6), .Y(new_n13_));
  AOI210     g03(.A0(new_n13_), .A1(new_n12_), .B0(i1), .Y(new_n14_));
  INV        g04(.A(i5), .Y(new_n15_));
  NO2        g05(.A(new_n15_), .B(i4), .Y(new_n16_));
  OAI210     g06(.A0(new_n16_), .A1(new_n14_), .B0(i7), .Y(new_n17_));
  INV        g07(.A(i6), .Y(new_n18_));
  NAi21      g08(.An(i3), .B(i8), .Y(new_n19_));
  NAi21      g09(.An(i5), .B(i7), .Y(new_n20_));
  OAI220     g10(.A0(new_n20_), .A1(new_n19_), .B0(new_n18_), .B1(i4), .Y(new_n21_));
  NA2        g11(.A(new_n21_), .B(i1), .Y(new_n22_));
  INV        g12(.A(i7), .Y(new_n23_));
  INV        g13(.A(i8), .Y(new_n24_));
  NAi21      g14(.An(i5), .B(i4), .Y(new_n25_));
  NAi21      g15(.An(i8), .B(i6), .Y(new_n26_));
  NA2        g16(.A(i5), .B(i3), .Y(new_n27_));
  OAI220     g17(.A0(new_n27_), .A1(new_n26_), .B0(new_n25_), .B1(new_n24_), .Y(new_n28_));
  INV        g18(.A(i0), .Y(new_n29_));
  NO2        g19(.A(i6), .B(new_n29_), .Y(new_n30_));
  INV        g20(.A(i3), .Y(new_n31_));
  OAI220     g21(.A0(new_n24_), .A1(i1), .B0(i7), .B1(new_n31_), .Y(new_n32_));
  AOI220     g22(.A0(new_n32_), .A1(new_n30_), .B0(new_n28_), .B1(new_n23_), .Y(new_n33_));
  NA3        g23(.A(new_n33_), .B(new_n22_), .C(new_n17_), .Y(new_n34_));
  NA2        g24(.A(new_n34_), .B(new_n11_), .Y(new_n35_));
  NAi21      g25(.An(i3), .B(i1), .Y(new_n36_));
  NAi21      g26(.An(i8), .B(i5), .Y(new_n37_));
  OAI220     g27(.A0(new_n37_), .A1(new_n36_), .B0(i6), .B1(new_n11_), .Y(new_n38_));
  NA2        g28(.A(i8), .B(i5), .Y(new_n39_));
  OAI220     g29(.A0(new_n39_), .A1(i6), .B0(new_n26_), .B1(i7), .Y(new_n40_));
  AOI220     g30(.A0(new_n40_), .A1(i1), .B0(new_n38_), .B1(i4), .Y(new_n41_));
  OAI220     g31(.A0(new_n20_), .A1(new_n18_), .B0(new_n24_), .B1(i4), .Y(new_n42_));
  NA3        g32(.A(i8), .B(i5), .C(i1), .Y(new_n43_));
  AOI210     g33(.A0(i8), .A1(i5), .B0(i1), .Y(new_n44_));
  AN2        g34(.A(i5), .B(i2), .Y(new_n45_));
  NO3        g35(.A(new_n45_), .B(new_n44_), .C(new_n31_), .Y(new_n46_));
  AOI220     g36(.A0(new_n46_), .A1(new_n43_), .B0(new_n42_), .B1(i2), .Y(new_n47_));
  AOI210     g37(.A0(new_n47_), .A1(new_n41_), .B0(i0), .Y(new_n48_));
  NO3        g38(.A(i8), .B(i4), .C(new_n11_), .Y(new_n49_));
  NO3        g39(.A(i7), .B(i3), .C(new_n29_), .Y(new_n50_));
  OAI210     g40(.A0(new_n50_), .A1(new_n49_), .B0(i1), .Y(new_n51_));
  NAi21      g41(.An(i6), .B(i4), .Y(new_n52_));
  OAI220     g42(.A0(new_n52_), .A1(i7), .B0(i4), .B1(new_n11_), .Y(new_n53_));
  NO2        g43(.A(i8), .B(new_n31_), .Y(new_n54_));
  OAI210     g44(.A0(i4), .A1(i3), .B0(i8), .Y(new_n55_));
  NO2        g45(.A(new_n23_), .B(i1), .Y(new_n56_));
  AOI220     g46(.A0(new_n56_), .A1(new_n55_), .B0(new_n54_), .B1(new_n53_), .Y(new_n57_));
  AOI210     g47(.A0(new_n57_), .A1(new_n51_), .B0(new_n15_), .Y(new_n58_));
  NO3        g48(.A(new_n24_), .B(i5), .C(i4), .Y(new_n59_));
  OAI210     g49(.A0(new_n59_), .A1(new_n30_), .B0(i2), .Y(new_n60_));
  OR2        g50(.A(new_n52_), .B(new_n23_), .Y(new_n61_));
  AOI210     g51(.A0(new_n61_), .A1(new_n60_), .B0(i3), .Y(new_n62_));
  OAI210     g52(.A0(i6), .A1(i4), .B0(i1), .Y(new_n63_));
  NO2        g53(.A(new_n24_), .B(new_n29_), .Y(new_n64_));
  OAI210     g54(.A0(new_n11_), .A1(i1), .B0(i3), .Y(new_n65_));
  OA210      g55(.A0(i4), .A1(i3), .B0(i6), .Y(new_n66_));
  AOI220     g56(.A0(new_n66_), .A1(new_n65_), .B0(new_n64_), .B1(new_n63_), .Y(new_n67_));
  OAI220     g57(.A0(new_n26_), .A1(i4), .B0(new_n12_), .B1(i6), .Y(new_n68_));
  NO2        g58(.A(new_n26_), .B(new_n25_), .Y(new_n69_));
  AOI210     g59(.A0(new_n68_), .A1(i0), .B0(new_n69_), .Y(new_n70_));
  OAI210     g60(.A0(new_n67_), .A1(i7), .B0(new_n70_), .Y(new_n71_));
  NO4        g61(.A(new_n71_), .B(new_n62_), .C(new_n58_), .D(new_n48_), .Y(new_n72_));
  NA2        g62(.A(new_n72_), .B(new_n35_), .Y(zori0));
endmodule


