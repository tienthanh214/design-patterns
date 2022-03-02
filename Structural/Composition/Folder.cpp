#include "Folder.h"
#include <iostream>
#include <algorithm>

Folder::Folder(std::string _name): FileComponent(_name) {}

Folder::~Folder() {
    for (size_t i = 0; i < elements.size(); ++i) {
        if (elements[i]) {
            delete elements[i];
            elements[i] = nullptr;
        }
    }
    elements.clear();
}

void Folder::showInfo() {
    std::cout << "Folder's name: " << this->name << std::endl;
    for (size_t i = 0; i < elements.size(); ++i) {
        elements[i]->showInfo();
    }
}

void Folder::add(FileComponent* files) {
    elements.push_back(files);
}

void Folder::remove(FileComponent* files) {
    elements.erase(std::remove(elements.begin(), elements.end(), files), elements.end());
}