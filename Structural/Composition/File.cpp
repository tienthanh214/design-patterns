#include "File.h"
#include <iostream>

File::File(std::string _name): FileComponent(_name) {}

File::~File() {}

void File::showInfo() {
    std::cout << "File's name: " << this->name << std::endl;
}