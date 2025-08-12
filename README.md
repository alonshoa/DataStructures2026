# DataStructures2026

This repository contains materials and configurations for the DataStructures2026 course.

## Codespaces Dev Container

The repository includes a [dev container](.devcontainer/devcontainer.json) configured for testing the GitHub Pages site using Jekyll.

### Troubleshooting

The dev container uses an image where Jekyll should already be installed. If you encounter issues in GitHub Codespaces:

- **`gem install jekyll bundler` returns `403 Forbidden`** – This indicates the container cannot reach RubyGems. Check your network connection or try again later. The bundled image should already have the required gems.
- **`jekyll: command not found`** – Jekyll is missing from the image. Run `gem install jekyll bundler` or `bundle install` inside the container to install it manually.

After addressing these issues, run `jekyll build` to generate the site.

