#include <iostream>

using namespace std;

main()
{
    int code,jeniskelamin, umur, beratbadan;
    char keluhan (50);

    cout << "1. obat 1\n";
    cout << "2. obat 2\n";
    cout << "3. obat 3\n";

    cout << "masukan pilihan: ";
    cin >> code;

    switch(code){

case 1 :
    cout << "kondisi" << endl;
    cout << "1. laki-laki >150kg <21 tahun\n";
    break;
case 2 :
    cout << "kondisi" << endl;
    cout << "2. laki-laki >150kg <21 tahun\n";
    break;
case 3 :
    cout << "kondisi" << endl;
    cout << "3. laki-laki >150kg <21 tahun\n";
    break;


    }
return 0;
}

